package com.spthhrms.bean;

public class BranchConfigBean {

	private String bname;
	private String baddress;
	private String bpincode;
	private String blatitute;
	private String blongitude;
	private String bstarttime;
	private String bendtime;
	private String btotaltime;
	private String morning;
	private String afternoon;
	private String evening;
	private String weekof;
	private String weekofday;
	private String shift;
	
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBaddress() {
		return baddress;
	}
	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}
	public String getBpincode() {
		return bpincode;
	}
	public void setBpincode(String bpincode) {
		this.bpincode = bpincode;
	}
	public String getBlatitute() {
		return blatitute;
	}
	public void setBlatitute(String blatitute) {
		this.blatitute = blatitute;
	}
	public String getBlongitude() {
		return blongitude;
	}
	public void setBlongitude(String blongitude) {
		this.blongitude = blongitude;
	}
	public String getBstarttime() {
		return bstarttime;
	}
	public void setBstarttime(String bstarttime) {
		this.bstarttime = bstarttime;
	}
	public String getBendtime() {
		return bendtime;
	}
	public void setBendtime(String bendtime) {
		this.bendtime = bendtime;
	}
	public String getMorning() {
		return morning;
	}
	public void setMorning(String morning) {
		this.morning = morning;
	}
	public String getAfternoon() {
		return afternoon;
	}
	public void setAfternoon(String afternoon) {
		this.afternoon = afternoon;
	}
	public String getEvening() {
		return evening;
	}
	public void setEvening(String evening) {
		this.evening = evening;
	}
	public String getWeekof() {
		return weekof;
	}
	public void setWeekof(String weekof) {
		this.weekof = weekof;
	}
	public String getWeekofday() {
		return weekofday;
	}
	public void setWeekofday(String weekofday) {
		this.weekofday = weekofday;
	}
	
	public String getBtotaltime() {
		return btotaltime;
	}
	public void setBtotaltime(String btotaltime) {
		this.btotaltime = btotaltime;
	}
	@Override
	public String toString() {
		return "BranchConfigBean [bname=" + bname + ", baddress=" + baddress + ", bpincode=" + bpincode + ", blatitute="
				+ blatitute + ", blongitude=" + blongitude + ", bstarttime=" + bstarttime + ", bendtime=" + bendtime
				+ ", btotaltime=" + btotaltime + ", morning=" + morning + ", afternoon=" + afternoon + ", evening="
				+ evening + ", weekof=" + weekof + ", weekofday=" + weekofday + ", shift=" + shift + "]";
	}
	
	
	
	
}
