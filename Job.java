package com.spthhrms.bean;

import java.sql.Blob;
import java.sql.Date;

public class Job {

	private Integer jobId;
	private String jobTitle;
	private Float payScale;
	private String department;
	private String location;
	private String qualification;
	private String experienceRequired;
	private Blob responsibilities;
	private Date jobPostedDate;
	private Date jobExpiredDate;
	private Integer applicantCount;
	private String vacancyStatus;
	private String description;

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Float getPayScale() {
		return payScale;
	}

	public void setPayScale(Float payScale) {
		this.payScale = payScale;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperienceRequired() {
		return experienceRequired;
	}

	public void setExperienceRequired(String experienceRequired) {
		this.experienceRequired = experienceRequired;
	}

	public Blob getResponsibilities() {
		return responsibilities;
	}

	public void setResponsibilities(Blob responsibilities) {
		this.responsibilities = responsibilities;
	}

	public Date getJobPostedDate() {
		return jobPostedDate;
	}

	public void setJobPostedDate(Date jobPostedDate) {
		this.jobPostedDate = jobPostedDate;
	}

	public Date getJobExpiredDate() {
		return jobExpiredDate;
	}

	public void setJobExpiredDate(Date jobExpiredDate) {
		this.jobExpiredDate = jobExpiredDate;
	}

	public Integer getApplicantCount() {
		return applicantCount;
	}

	public void setApplicantCount(Integer applicantCount) {
		this.applicantCount = applicantCount;
	}

	public String getVacancyStatus() {
		return vacancyStatus;
	}

	public void setVacancyStatus(String vacancyStatus) {
		this.vacancyStatus = vacancyStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobTitle=" + jobTitle + ", payScale=" + payScale + ", department="
				+ department + ", location=" + location + ", qualification=" + qualification + ", experienceRequired="
				+ experienceRequired + ", responsibilities=" + responsibilities + ", jobPostedDate=" + jobPostedDate
				+ ", jobExpiredDate=" + jobExpiredDate + ", applicantCount=" + applicantCount + ", vacancyStatus="
				+ vacancyStatus + ", description=" + description + "]";
	}

}
