package Allrooms;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SuppressWarnings("serial")
public class AllRoomBean implements Serializable {
	 private String roomname,Bookingpersonname;
	 private double price;
	 private Date checkin,checkout;
	 private Long phonenumber;
	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public String getBookingpersonname() {
		return Bookingpersonname;
	}
	public void setBookingpersonname(String bookingpersonname) {
		Bookingpersonname = bookingpersonname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getCheckin() {
		return checkin;
	}
	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	public Date getCheckout() {
		return checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
	 
	
}