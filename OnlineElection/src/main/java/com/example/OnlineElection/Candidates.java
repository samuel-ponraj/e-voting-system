package com.example.OnlineElection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="candidates")

public class Candidates {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column (name = "first_name")
	private String first_name;
	@Column (name = "last_name")
	private String last_name;
	@Column (name = "party_name")
	private String party_name;
	@Column (name = "gender")
	private String gender;
	@Column (name = "no_of_votes")
	private int no_of_votes;
	
	
	public Candidates() {
		
	}




	public Candidates(int id, String first_name, String last_name, String party_name, String gender, int no_of_votes) {
	
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.party_name = party_name;
		this.gender = gender;
		this.no_of_votes = no_of_votes;
		
		
	}

	public Candidates(String first_name, String last_name, String party_name, String gender, int no_of_votes) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.party_name = party_name;
		this.gender = gender;
		this.no_of_votes = no_of_votes;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getParty_name() {
		return party_name;
	}

	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public int getNo_of_votes() {
		return no_of_votes;
	}

	public void setNo_of_votes(int no_of_votes) {
		this.no_of_votes = no_of_votes;
	}
	

	@Override
	public String toString() {
		return "Candidates [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", party_name="
				+ party_name + ", gender=" + gender + ", no_of_votes=" + no_of_votes + "]";
	}




}
