package Register;

import java.io.Serializable;

public class Userbean implements Serializable {
	private String Username;
	private String password;
	private String Fristname;
	private String Lastname;
	private String Address;
	private String Email;
	private Long Phone;
	public Userbean() {
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFristname() {
		return Fristname;
	}
	public void setFristname(String fristname) {
		Fristname = fristname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
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
	public Long getPhone() {
		return Phone;
	}
	public void setPhone(Long phone) {
		Phone = phone;
	}
	

}
