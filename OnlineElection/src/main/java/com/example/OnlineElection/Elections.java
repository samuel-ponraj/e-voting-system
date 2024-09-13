package com.example.OnlineElection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="elections")
public class Elections {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column (name = "name")
	private String name;
	@Column (name = "date")
	private String date;
	public Elections() {
		super();
	}
	
	public Elections(int id, String name, String date) {
		this.id = id;
		this.name = name;
		this.date = date;
	}
	
	public Elections(String name, String date) {
		this.name = name;
		this.date = date;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Elections [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
	
	
}
