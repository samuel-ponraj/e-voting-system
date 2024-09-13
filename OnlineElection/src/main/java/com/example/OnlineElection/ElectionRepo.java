package com.example.OnlineElection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectionRepo  extends JpaRepository<Elections, Integer>{

}
