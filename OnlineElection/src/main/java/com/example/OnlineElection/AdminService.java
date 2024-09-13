package com.example.OnlineElection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class AdminService {
	
	@Autowired
	private AdminRepo ar;
	
	public void incrementVote(int candidateId) {
        ar.incrementVote(candidateId);
    }
	
	public Candidates save(Candidates c) 
	{
		return ar.save(c);
	}
	
	public Candidates get(int id) {
        return ar.findById(id).get();
    }
	

	 public List<Candidates> listAll() {
	        return ar.findAll();
	    }
	 
	 public void deletecandidate(int id) {
	        ar.deleteById(id);
	    }

	 public Candidates updateCandidate(Candidates candidate) {
	        Candidates existingCandidate = ar.findById(candidate.getId()).orElse(null);
	        if (existingCandidate != null) {
	            // Update the existing candidate with the new data
	            existingCandidate.setFirst_name(candidate.getFirst_name());
	            existingCandidate.setLast_name(candidate.getLast_name());
	            existingCandidate.setParty_name(candidate.getParty_name());
	            existingCandidate.setGender(candidate.getGender());
	            // Save the updated candidate
	            return ar.save(existingCandidate);
	        }
	        return null; // Or throw an exception if the candidate with the given ID is not found
	    }
	 
}
