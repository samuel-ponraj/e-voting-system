package com.example.OnlineElection;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotersRepo extends JpaRepository<Voters, Integer>
{
	Voters findByUsernameAndPassword(String username, String password);
	
	Voters findByUsername(String username);
	
	
}
