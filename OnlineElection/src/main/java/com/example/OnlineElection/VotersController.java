package com.example.OnlineElection;


import java.math.BigInteger;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;



@Controller

public class VotersController {
	
	
	@Autowired
	private VotersService service;
	

	
	@GetMapping("/onlinevotingsystem")
	public ModelAndView homepage() {
		ModelAndView mav = new ModelAndView("onlinevotingsystem");
		mav.addObject("user", new Voters());
		return mav;
	}

	@PostMapping("/login")
	public String login(@ModelAttribute("user") Voters v, HttpSession session) {
	    Voters authenticatedUser = service.loggin(v.getUsername(), v.getPassword());

	    if (Objects.nonNull(authenticatedUser)) {
	        session.setAttribute("username", authenticatedUser.getUsername());
	        
	        // Here we assume the user's role is determined from their credentials or a role field
	        if ("admin".equals(authenticatedUser.getUsername()) && "adminpassword".equals(authenticatedUser.getPassword())) {
	            session.setAttribute("role", "ADMIN");
	           
	            return "redirect:/AdminPage";
	        } else {
	            session.setAttribute("role", "USER");
	            return "redirect:/UserPage";
	        }
	    } else {
	        return "redirect:/onlinevotingsystem?error";
	    }
	}
	
	@GetMapping("/AdminPage")
	public String adminpage() {
		return "AdminPage";
	}
	
	@GetMapping("/UserPage")
	public String userpage() {
		return "UserPage";
	}
	
	@RequestMapping(value="/profile", method=RequestMethod.GET)
	public String userProfile(Model model, HttpServletRequest request) {
		 HttpSession session = request.getSession();
		    String username = (String) session.getAttribute("username");
	    Voters user = service.getUserByUsername(username);
	    model.addAttribute("user", user);
	    System.out.println(user);
	    return "profile"; 
	}
	
	
	@GetMapping("/register")
	public String registerpage() {
		return "RegisterPage";
	}
	
	@PostMapping("/register")
    public String savedata(
        @RequestParam("first_name") String firstName,
        @RequestParam("last_name") String lastName,
        @RequestParam("username") String username,
        @RequestParam("password") String password,
        @RequestParam("dob") Date dob,
        @RequestParam("mobile_no") BigInteger mobileNo,
        @RequestParam("gender") String gender) {

        // Create a Voters object or perform data processing here
        Voters voter = new Voters();
        voter.setFirst_name(firstName);
        voter.setLast_name(lastName);
        voter.setUsername(username);
        voter.setPassword(password);
        voter.setDob(dob);
        voter.setMobile_no(mobileNo);
        voter.setGender(gender);

        // Save the voter using the service
        service.save(voter);
        return "redirect:/onlinevotingsystem";
	}
	
	@GetMapping("/userlist")
    public String userlistpage(Model model) {
		List<Voters> voters = service.listAll();
	    model.addAttribute("voters", voters);  
	    return "userlist";
    }
	
	
    @RequestMapping("/delete/{id}")
    public String deleteuser(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/userlist";
    }
    

  

	
	
}
