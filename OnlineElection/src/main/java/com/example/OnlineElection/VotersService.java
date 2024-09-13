package com.example.OnlineElection;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VotersService {
	
	@Autowired
	private VotersRepo vr;
	
	
	
	public Voters save(Voters v) 
	{
		return vr.save(v);
	}
	
	public Voters getUserByUsername(String username) {
        return vr.findByUsername(username);
    }
	
	 public List<Voters> listAll() {
	        return vr.findAll();
	    }
	 
	 public void delete(int id) {
	        vr.deleteById(id);
	    }
	 
	
	public Voters loggin(String username, String password) {
        return vr.findByUsernameAndPassword(username, password);
		
    }

	
	public Voters user(String username) {
		return vr.findByUsername(username);
		
	}
	
	
    
	 
	

	
	
}
