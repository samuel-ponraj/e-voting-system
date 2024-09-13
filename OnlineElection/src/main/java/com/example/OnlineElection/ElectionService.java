package com.example.OnlineElection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectionService {

	@Autowired
	private ElectionRepo sr;
	
	public Elections save(Elections e) 
	{
		return sr.save(e);
	}
	
	public Elections get(int id) {
        return sr.findById(id).get();
    }

	 public List<Elections> listAll() {
	        return sr.findAll();
	    }
	 
	 public void deleteelection(int id) {
	        sr.deleteById(id);
	    }
	 
	 public Elections updateElection(Elections election) {
	        Elections existingElection = sr.findById(election.getId()).orElse(null);
	        if (existingElection != null) {
	            // Update the existing candidate with the new data
	        	existingElection.setName(election.getName());
	        	existingElection.setDate(election.getDate());
	            // Save the updated candidate
	            return sr.save(existingElection);
	        }
	        return null; // Or throw an exception if the candidate with the given ID is not found
	    }
}
