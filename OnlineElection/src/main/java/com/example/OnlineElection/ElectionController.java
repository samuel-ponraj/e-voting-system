package com.example.OnlineElection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ElectionController {

	@Autowired
	private ElectionService elecserv;
	
	
	@GetMapping("/addelection")
    public String addelection() {
        return "addelection";
    }
	
	
	@PostMapping("/addelection")
    public String savedata(
        @RequestParam("name") String name,
        @RequestParam("date") String date){

        // Create a Voters object or perform data processing here
        Elections election = new Elections();
        election.setName(name);
        election.setDate(date);

        // Save the voter using the service
        elecserv.save(election);
        return "redirect:/electionlist";
	}
	
	@GetMapping("/electionlist")
    public String electionlistpage(Model model) {
		List<Elections> elections = elecserv.listAll();
	    model.addAttribute("elections", elections);  
	    return "electionlist";
    }
	
	
	@RequestMapping(value="/editelection/{id}")
    public String edit(@PathVariable int id, Model model) {
		Elections election=elecserv.get(id);
		model.addAttribute("election", election);
		return "editelection";
		
    }

	@RequestMapping(value = "/editelection/{id}", method = RequestMethod.POST)
    public String editsave(@ModelAttribute("election") Elections election) {
        elecserv.updateElection(election);
        return "redirect:/electionlist"; // Redirect to the list of candidates page
    }
	
	
    @RequestMapping("/deleteelection/{id}")
    public String deleteelection(@PathVariable(name = "id") int id) {
        elecserv.deleteelection(id);
        return "redirect:/electionlist";
    }
    
    
    @GetMapping("/ongoingelection")
    public String ongoingelection(Model model) {
		List<Elections> elections = elecserv.listAll();
	    model.addAttribute("elections", elections);  
	    return "ongoingelection";
    }
	
   
}
