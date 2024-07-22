package AdminLogin;

import java.io.Serializable;

public class AdminBean implements Serializable {
	 private String Username,Password,firstname,lastname,Address,Email;
	 private Long  Phonenumber;
	 public AdminBean() {
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Long getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		Phonenumber = phonenumber;
	}
	 

}
