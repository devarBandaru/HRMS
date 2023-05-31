package com.spthhrms.bean;

import java.io.InputStream;
import java.sql.Date;

public class ApplyJob {

	private String applicantId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String qualification;
	private String experience;
	private Date appliedDate;
	private String coverLetter;
	private Integer jodId;

	private InputStream resume;

	public String getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String string) {
		this.experience = string;
	}

	public Date getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

	public Integer getJodId() {
		return jodId;
	}

	public void setJodId(Integer jodId) {
		this.jodId = jodId;
	}

	public InputStream getResume() {
		return resume;
	}

	public void setResume(InputStream resume) {
		this.resume = resume;
	}

	
	
}
