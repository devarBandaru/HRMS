package com.spthhrms.bean;

/**
 * @author Bandaru Kalpana
 *
 */
public class UsersListBean {

	private String role;
	private String Firstname;
	private String Lastname;
	private String username;
	private String email;
	private String mobile;
	private String uempid;
	private String sickleaves;
	private String casualleaves;
	private String date;
	private String fromdate;
	private String joiningdate;
	
	public String getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}
	public String getFromdate() {
		return fromdate;
	}
	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}
	public String getTodate() {
		return todate;
	}
	public void setTodate(String todate) {
		this.todate = todate;
	}
	private String todate;
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUempid() {
		return uempid;
	}
	public void setUempid(String uempid) {
		this.uempid = uempid;
	}
	public String getSickleaves() {
		return sickleaves;
	}
	public void setSickleaves(String sickleaves) {
		this.sickleaves = sickleaves;
	}
	public String getCasualleaves() {
		return casualleaves;
	}
	public void setCasualleaves(String casualleaves) {
		this.casualleaves = casualleaves;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "UsersListBean [role=" + role + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", username="
				+ username + ", email=" + email + ", mobile=" + mobile + ", uempid=" + uempid + ", sickleaves="
				+ sickleaves + ", casualleaves=" + casualleaves + ", date=" + date + ", fromdate=" + fromdate
				+ ", joiningdate=" + joiningdate + ", todate=" + todate + "]";
	}
	
	
	
	
	
}
