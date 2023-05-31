package com.spthhrms.bean;

public class PasswordBean {

	private String email;
	private String link;
	private String date;
	private String time;
	private String otp;
	
	
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "PasswordBean [email=" + email + ", link=" + link + ", date=" + date + ", time=" + time + ", otp=" + otp
				+ "]";
	}
		
}
