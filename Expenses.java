package com.spthhrms.bean;

import java.io.InputStream;

public class Expenses {
	
	private int expId;
	private int expClaimID;
	private String expEmpID;
	private String expEmpName;
	private String expClaimDate;
	private String expSubject;
	private Double expAmount;
	private String expSubmitDate;
	private String expStatus;
	private String expRemarks;
	private String expApproverID;
	private String expApprovedDate;
	private String branch;
	
	protected InputStream expPhoto;

	public int getExpId() {
		return expId;
	}

	public void setExpId(int expId) {
		this.expId = expId;
	}

	public int getExpClaimID() {
		return expClaimID;
	}

	public void setExpClaimID(int expClaimID) {
		this.expClaimID = expClaimID;
	}

	public String getExpEmpID() {
		return expEmpID;
	}

	public void setExpEmpID(String expEmpID) {
		this.expEmpID = expEmpID;
	}

	public String getExpEmpName() {
		return expEmpName;
	}

	public void setExpEmpName(String expEmpName) {
		this.expEmpName = expEmpName;
	}

	public String getExpClaimDate() {
		return expClaimDate;
	}

	public void setExpClaimDate(String expClaimDate) {
		this.expClaimDate = expClaimDate;
	}

	public String getExpSubject() {
		return expSubject;
	}

	public void setExpSubject(String expSubject) {
		this.expSubject = expSubject;
	}

	public Double getExpAmount() {
		return expAmount;
	}

	public void setExpAmount(Double expAmount) {
		this.expAmount = expAmount;
	}

	public String getExpSubmitDate() {
		return expSubmitDate;
	}

	public void setExpSubmitDate(String expSubmitDate) {
		this.expSubmitDate = expSubmitDate;
	}

	public String getExpStatus() {
		return expStatus;
	}

	public void setExpStatus(String expStatus) {
		this.expStatus = expStatus;
	}

	public String getExpRemarks() {
		return expRemarks;
	}

	public void setExpRemarks(String expRemarks) {
		this.expRemarks = expRemarks;
	}

	public String getExpApproverID() {
		return expApproverID;
	}

	public void setExpApproverID(String expApproverID) {
		this.expApproverID = expApproverID;
	}

	public String getExpApprovedDate() {
		return expApprovedDate;
	}

	public void setExpApprovedDate(String expApprovedDate) {
		this.expApprovedDate = expApprovedDate;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public InputStream getExpPhoto() {
		return expPhoto;
	}

	public void setExpPhoto(InputStream expPhoto) {
		this.expPhoto = expPhoto;
	}

	@Override
	public String toString() {
		return "Expenses [expId=" + expId + ", expClaimID=" + expClaimID + ", expEmpID=" + expEmpID + ", expEmpName="
				+ expEmpName + ", expClaimDate=" + expClaimDate + ", expSubject=" + expSubject + ", expAmount="
				+ expAmount + ", expSubmitDate=" + expSubmitDate + ", expStatus=" + expStatus + ", expRemarks="
				+ expRemarks + ", expApproverID=" + expApproverID + ", expApprovedDate=" + expApprovedDate + ", branch="
				+ branch + ", expPhoto=" + expPhoto + "]";
	}

	
}
	