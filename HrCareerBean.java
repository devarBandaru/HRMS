package com.spthhrms.bean;

import java.io.InputStream;

public class HrCareerBean {
	
	
	private String 	c_Hr_Job_ID;
	private String  c_Hr_Job_Title;
	private String 	c_Hr_Pay_Scale;
	private String  c_Hr_Department;
	private String  c_Hr_Location;
	private String  c_Hr_Qualification;
	private String  c_Hr_Experience_Released;
	private String  c_Hr_Job_Release_Date;
	private String  c_Hr_Job_Close_Date;
	private String  c_Hr_Applicants_Count;
	private String  c_Hr_Vacancy_Status;
	protected InputStream c_Hr_Responsibilities;
	
	public String getC_Hr_Job_ID() {
		return c_Hr_Job_ID;
	}
	public void setC_Hr_Job_ID(String c_Hr_Job_ID) {
		this.c_Hr_Job_ID = c_Hr_Job_ID;
	}
	public String getC_Hr_Job_Title() {
		return c_Hr_Job_Title;
	}
	public void setC_Hr_Job_Title(String c_Hr_Job_Title) {
		this.c_Hr_Job_Title = c_Hr_Job_Title;
	}
	public String getC_Hr_Pay_Scale() {
		return c_Hr_Pay_Scale;
	}
	public void setC_Hr_Pay_Scale(String c_Hr_Pay_Scale) {
		this.c_Hr_Pay_Scale = c_Hr_Pay_Scale;
	}
	public String getC_Hr_Department() {
		return c_Hr_Department;
	}
	public void setC_Hr_Department(String c_Hr_Department) {
		this.c_Hr_Department = c_Hr_Department;
	}
	public String getC_Hr_Location() {
		return c_Hr_Location;
	}
	public void setC_Hr_Location(String c_Hr_Location) {
		this.c_Hr_Location = c_Hr_Location;
	}
	public String getC_Hr_Qualification() {
		return c_Hr_Qualification;
	}
	public void setC_Hr_Qualification(String c_Hr_Qualification) {
		this.c_Hr_Qualification = c_Hr_Qualification;
	}
	public String getC_Hr_Experience_Released() {
		return c_Hr_Experience_Released;
	}
	public void setC_Hr_Experience_Released(String c_Hr_Experience_Released) {
		this.c_Hr_Experience_Released = c_Hr_Experience_Released;
	}
	public String getC_Hr_Job_Release_Date() {
		return c_Hr_Job_Release_Date;
	}
	public void setC_Hr_Job_Release_Date(String c_Hr_Job_Release_Date) {
		this.c_Hr_Job_Release_Date = c_Hr_Job_Release_Date;
	}
	public String getC_Hr_Job_Close_Date() {
		return c_Hr_Job_Close_Date;
	}
	public void setC_Hr_Job_Close_Date(String c_Hr_Job_Close_Date) {
		this.c_Hr_Job_Close_Date = c_Hr_Job_Close_Date;
	}
	public String getC_Hr_Applicants_Count() {
		return c_Hr_Applicants_Count;
	}
	public void setC_Hr_Applicants_Count(String c_Hr_Applicants_Count) {
		this.c_Hr_Applicants_Count = c_Hr_Applicants_Count;
	}
	public String getC_Hr_Vacancy_Status() {
		return c_Hr_Vacancy_Status;
	}
	public void setC_Hr_Vacancy_Status(String c_Hr_Vacancy_Status) {
		this.c_Hr_Vacancy_Status = c_Hr_Vacancy_Status;
	}
	public InputStream getC_Hr_Responsibilities() {
		return c_Hr_Responsibilities;
	}
	public void setC_Hr_Responsibilities(InputStream c_Hr_Responsibilities) {
		this.c_Hr_Responsibilities = c_Hr_Responsibilities;
	}
	@Override
	public String toString() {
		return "HrCareerBean [c_Hr_Job_ID=" + c_Hr_Job_ID + ", c_Hr_Job_Title=" + c_Hr_Job_Title + ", c_Hr_Pay_Scale="
				+ c_Hr_Pay_Scale + ", c_Hr_Department=" + c_Hr_Department + ", c_Hr_Location=" + c_Hr_Location
				+ ", c_Hr_Qualification=" + c_Hr_Qualification + ", c_Hr_Experience_Released="
				+ c_Hr_Experience_Released + ", c_Hr_Job_Release_Date=" + c_Hr_Job_Release_Date
				+ ", c_Hr_Job_Close_Date=" + c_Hr_Job_Close_Date + ", c_Hr_Applicants_Count=" + c_Hr_Applicants_Count
				+ ", c_Hr_Vacancy_Status=" + c_Hr_Vacancy_Status + ", c_Hr_Responsibilities=" + c_Hr_Responsibilities
				+ "]";
	}
	
	
	
}
