package com.spthhrms.bean;

public class RoasterBean {

	private String rEmpId;
	private String rEmployeeName;
	private String rDate;
	private String rNumberOfShifts;
	private String rInTime;
	private String rOutTime;
	private String rId;
	private String rstatus;
	private String rrolestatus;
	private String radstatus;
	private String rnewempid;
	private String rnewempname;
	private String rbranch;
	private String rDay;
	private String rTotalHours;

	public String getRbranch() {
		return rbranch;
	}

	public void setRbranch(String rbranch) {
		this.rbranch = rbranch;
	}

	public String getRnewempid() {
		return rnewempid;
	}

	public void setRnewempid(String rnewempid) {
		this.rnewempid = rnewempid;
	}

	public String getRnewempname() {
		return rnewempname;
	}

	public void setRnewempname(String rnewempname) {
		this.rnewempname = rnewempname;
	}

	public String getRadstatus() {
		return radstatus;
	}

	public void setRadstatus(String radstatus) {
		this.radstatus = radstatus;
	}

	public String getRrolestatus() {
		return rrolestatus;
	}

	public void setRrolestatus(String rrolestatus) {
		this.rrolestatus = rrolestatus;
	}

	public String getRstatus() {
		return rstatus;
	}

	public void setRstatus(String rstatus) {
		this.rstatus = rstatus;
	}

	public String getrEmpId() {
		return rEmpId;
	}

	public void setrEmpId(String rEmpId) {
		this.rEmpId = rEmpId;
	}

	public String getrEmployeeName() {
		return rEmployeeName;
	}

	public void setrEmployeeName(String rEmployeeName) {
		this.rEmployeeName = rEmployeeName;
	}

	public String getrDate() {
		return rDate;
	}

	public void setrDate(String rDate) {
		this.rDate = rDate;
	}

	public String getrNumberOfShifts() {
		return rNumberOfShifts;
	}

	public void setrNumberOfShifts(String rNumberOfShifts) {
		this.rNumberOfShifts = rNumberOfShifts;
	}

	public String getrInTime() {
		return rInTime;
	}

	public void setrInTime(String rInTime) {
		this.rInTime = rInTime;
	}

	public String getrOutTime() {
		return rOutTime;
	}

	public void setrOutTime(String rOutTime) {
		this.rOutTime = rOutTime;
	}

	public String getrId() {
		return rId;
	}

	public void setrId(String rId) {
		this.rId = rId;
	}

	public String getrDay() {
		return rDay;
	}

	public void setrDay(String rDay) {
		this.rDay = rDay;
	}

	public String getrTotalHours() {
		return rTotalHours;
	}

	public void setrTotalHours(String rTotalHours) {
		this.rTotalHours = rTotalHours;
	}

	@Override
	public String toString() {
		return "RoasterBean [rEmpId=" + rEmpId + ", rEmployeeName=" + rEmployeeName + ", rDate=" + rDate
				+ ", rNumberOfShifts=" + rNumberOfShifts + ", rInTime=" + rInTime + ", rOutTime=" + rOutTime + ", rId="
				+ rId + ", rstatus=" + rstatus + ", rrolestatus=" + rrolestatus + ", radstatus=" + radstatus
				+ ", rnewempid=" + rnewempid + ", rnewempname=" + rnewempname + ", rbranch=" + rbranch + ", rDay="
				+ rDay + ", rTotalHours=" + rTotalHours + "]";
	}

}
