package com.example.OnlineElection;

import java.math.BigInteger;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="voters")
public class Voters {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		@Column (name = "first_name")
		private String first_name;
		@Column (name = "last_name")
		private String last_name;
		@Column (name = "username")
		private String username;
		@Column (name = "password")
		private String password;
		@Column (name = "dob")
		private Date dob;
		@Column (name = "mobile_no")
		private BigInteger mobile_no;
		@Column (name = "gender")
		private String gender;
		
		public Voters() {
		
		}

		public Voters(int id, String first_name, String last_name, String username, String password, Date dob,
				BigInteger mobile_no, String gender) {
			
			this.id = id;
			this.first_name = first_name;
			this.last_name = last_name;
			this.username = username;
			this.password = password;
			this.dob = dob;
			this.mobile_no = mobile_no;
			this.gender = gender;
		}

		public Voters(String first_name, String last_name, String username, String password, Date dob, BigInteger mobile_no,
				String gender) {
			super();
			this.first_name = first_name;
			this.last_name = last_name;
			this.username = username;
			this.password = password;
			this.dob = dob;
			this.mobile_no = mobile_no;
			this.gender = gender;
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

		public String getUsername() {
			return username;
		}

		public void setUsername(String user_id) {
			this.username = user_id;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		public BigInteger getMobile_no() {
			return mobile_no;
		}

		public void setMobile_no(BigInteger mobile_no) {
			this.mobile_no = mobile_no;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Voters [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", user_id="
					+ username + ", password=" + password + ", dob=" + dob + ", mobile_no=" + mobile_no + ", gender="
					+ gender + "]";
		}
		
		
		
	
		
	}

	