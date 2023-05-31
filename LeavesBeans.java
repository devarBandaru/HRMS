package com.spthhrms.bean;

public class LeavesBeans {
	
	private int lId;
	
	private String lEmpID;
	 private String lEmpName;
	 private String lLeaveType; 
	 private String lFromDate;
	 private String lToDate;
	 private String lReason;
	 private String lContactOnLeave;
	 private String lStatus;
	 private int lDays;
	 private String lPostedDate;
	 private String lApproverId;
	 private String lApproverDate;
	 public int getlId() {
			return lId;
		}
		public void setlId(int lId) {
			this.lId = lId;
		}
	 public String getlApproverDate() {
		return lApproverDate;
	}
	public void setlApproverDate(String lApproverDate) {
		this.lApproverDate = lApproverDate;
	}
	private String lRemarks;
	public String getlEmpID() {
		return lEmpID;
	}
	public void setlEmpID(String lEmpID) {
		this.lEmpID = lEmpID;
	}
	public String getlEmpName() {
		return lEmpName;
	}
	public void setlEmpName(String lEmpName) {
		this.lEmpName = lEmpName;
	}
	public String getlLeaveType() {
		return lLeaveType;
	}
	public void setlLeaveType(String lLeaveType) {
		this.lLeaveType = lLeaveType;
	}
	public String getlFromDate() {
		return lFromDate;
	}
	public void setlFromDate(String lFromDate) {
		this.lFromDate = lFromDate;
	}
	public String getlToDate() {
		return lToDate;
	}
	public void setlToDate(String lToDate) {
		this.lToDate = lToDate;
	}
	public String getlReason() {
		return lReason;
	}
	public void setlReason(String lReason) {
		this.lReason = lReason;
	}
	public String getlContactOnLeave() {
		return lContactOnLeave;
	}
	public void setlContactOnLeave(String lContactOnLeave) {
		this.lContactOnLeave = lContactOnLeave;
	}
	public String getlStatus() {
		return lStatus;
	}
	public void setlStatus(String lStatus) {
		this.lStatus = lStatus;
	}
	public int getlDays() {
		return lDays;
	}
	public void setlDays(int lDays) {
		this.lDays = lDays;
	}
	public String getlPostedDate() {
		return lPostedDate;
	}
	public void setlPostedDate(String lPostedDate) {
		this.lPostedDate = lPostedDate;
	}
	
	public String getlApproverId() {
		return lApproverId;
	}
	public void setlApproverId(String lApproverId) {
		this.lApproverId = lApproverId;
	}
	public String getlRemarks() {
		return lRemarks;
	}
	public void setlRemarks(String lRemarks) {
		this.lRemarks = lRemarks;
	}
	@Override
	public String toString() {
		return "LeavesBeans [lId=" + lId + ", lEmpID=" + lEmpID + ", lEmpName=" + lEmpName + ", lLeaveType="
				+ lLeaveType + ", lFromDate=" + lFromDate + ", lToDate=" + lToDate + ", lReason=" + lReason
				+ ", lContactOnLeave=" + lContactOnLeave + ", lStatus=" + lStatus + ", lDays=" + lDays
				+ ", lPostedDate=" + lPostedDate + ", lApproverId=" + lApproverId + ", lApproverDate=" + lApproverDate
				+ ", lRemarks=" + lRemarks + "]";
	}
	
	
	 
	
}
