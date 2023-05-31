package com.spthhrms.bean;

public class AnnualHolidayBean {
	
	private String Hcountry;
	private String Hstate;
	private String Hday;
	private String Hdate;
	private String Hholidayname;
	public String getHcountry() {
		return Hcountry;
	}
	public void setHcountry(String hcountry) {
		Hcountry = hcountry;
	}
	public String getHstate() {
		return Hstate;
	}
	public void setHstate(String hstate) {
		Hstate = hstate;
	}
	public String getHday() {
		return Hday;
	}
	public void setHday(String hday) {
		Hday = hday;
	}
	public String getHdate() {
		return Hdate;
	}
	public void setHdate(String hdate) {
		Hdate = hdate;
	}
	public String getHholidayname() {
		return Hholidayname;
	}
	public void setHholidayname(String hholidayname) {
		Hholidayname = hholidayname;
	}
	@Override
	public String toString() {
		return "AnnualHolidayBean [Hcountry=" + Hcountry + ", Hstate=" + Hstate + ", Hday=" + Hday + ", Hdate=" + Hdate
				+ ", Hholidayname=" + Hholidayname + "]";
	}
}