	package com.example.demo.model;

	import com.fasterxml.jackson.annotation.JsonProperty;

	import jakarta.persistence.Entity;

	@Entity
public class Notification {
	



		String firstName;
		String lastName;
		String email;
		String phoneNumber;
		String supervisor;

		
		public Notification(String firstName, String lastName, String email, String phoneNumber, String supervisor) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.supervisor = supervisor;
		}
		
		public Notification() {
			super();
			// TODO Auto-generated constructor stub
		}

		@JsonProperty("firstName")
		public String getFirstName() {
			return firstName;
		}

		@JsonProperty("firstName")
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		@JsonProperty("lastName")
		public String getLastName() {
			return lastName;
		}

		@JsonProperty("lastName")
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		@JsonProperty("email")
		public String getEmail() {
			return email;
		}

		@JsonProperty("email")
		public void setEmail(String email) {
			this.email = email;
		}

		@JsonProperty("phoneNumber")
		public String getPhoneNumber() {
			return phoneNumber;
		}

		@JsonProperty("phoneNumber")
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		@JsonProperty("supervisor")
		public String getSupervisor() {
			return supervisor;
		}
		
		@JsonProperty("supervisor")
		public void setSupervisor(String supervisor) {
			this.supervisor = supervisor;
		}
		
		public String printNotification() {
			
			String notificationDetails = "firstName = " +this.firstName + "\n" +
					"lastName = " +this.lastName + "\n" +
					"email = " +this.email + "\n" +
					"phoneNumber = " +this.phoneNumber + "\n" +
					"supervisor = " +this.supervisor;
			return notificationDetails;
			
		}


}
