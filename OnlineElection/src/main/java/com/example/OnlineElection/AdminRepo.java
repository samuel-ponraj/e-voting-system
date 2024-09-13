package com.example.OnlineElection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AdminRepo extends JpaRepository<Candidates, Integer> {

	 @Modifying
	 @Transactional
	 @Query("UPDATE Candidates c SET c.no_of_votes = c.no_of_votes + 1 WHERE c.id = :candidateId")
	 void incrementVote(@Param("candidateId") int candidateId);
	
}
