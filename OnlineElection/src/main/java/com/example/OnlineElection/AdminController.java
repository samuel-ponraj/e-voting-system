package com.example.OnlineElection;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;




@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminserv;
	
	@GetMapping("/addcandidate")
    public String addcandidate() {
        return "addcandidate";
    }
	
	@PostMapping("/addcandidate")
    public String savedata(
        @RequestParam("first_name") String firstName,
        @RequestParam("last_name") String lastName,
        @RequestParam("party_name") String partyName,
        @RequestParam("gender") String gender) {

        // Create a Voters object or perform data processing here
        Candidates candidate = new Candidates();
        candidate.setFirst_name(firstName);
        candidate.setLast_name(lastName);
        candidate.setParty_name(partyName);
        candidate.setGender(gender);

        // Save the voter using the service
        adminserv.save(candidate);
        return "redirect:/candidatelist";
	}
	
	@GetMapping("/candidatelist")
    public String candidatelistpage(Model model) {
		List<Candidates> candidates = adminserv.listAll();
	    model.addAttribute("candidates", candidates);  
	    return "candidatelist";
    }
	
	
	@RequestMapping(value="/editcandidate/{id}")
    public String edit(@PathVariable int id, Model model) {
		Candidates candidate=adminserv.get(id);
		model.addAttribute("candidate", candidate);
		return "editcandidate";
		
    }

	@RequestMapping(value = "/editcandidate/{id}", method = RequestMethod.POST)
    public String editsave(@ModelAttribute("candidate") Candidates candidate) {
        adminserv.updateCandidate(candidate);
        return "redirect:/candidatelist"; // Redirect to the list of candidates page
    }
	
    
    @RequestMapping("/deletecandidate/{id}")
    public String deletecandidate(@PathVariable(name = "id") int id) {
        adminserv.deletecandidate(id);
        return "redirect:/candidatelist";
    }
	

    @GetMapping("/viewcandidates")
    public String viewcandidates(Model model) {
		List<Candidates> candidates = adminserv.listAll();
	    model.addAttribute("candidates", candidates);  
	    return "viewcandidates";
    }
	
    @PostMapping("/putvoting")
    public String vote(@RequestParam("candidateId") int candidateId, RedirectAttributes redirectAttributes) {
        try {
            adminserv.incrementVote(candidateId);
            redirectAttributes.addFlashAttribute("message", "Vote recorded successfully!");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error recording vote.");
        }
        return "redirect:/thanks";
    }
   
    @GetMapping("/thanks")
    public String thanks() {
        return "thanks";
    }

    @GetMapping("/result")
    public String result(Model model) {
		List<Candidates> candidates = adminserv.listAll();
	    model.addAttribute("candidates", candidates);  
	    return "result";
    }
}
