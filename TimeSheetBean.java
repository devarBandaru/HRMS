
package com.spthhrms.bean;

public class TimeSheetBean {

	private String tEmployeeId;
	private String tDate;
	private String tPunchIn;
	private String tPunchInHour;
	private String tPunchOut;
	private String tPunchOutHour;
	private String tBreak;
	private String tDuration;
	private String tCDate;
	private String tFirstName;
	private String tDayInNumber;
	private String tDayIntext;
	private String tOtHours;
	private String tStatus;
	private String tShift;
	private String tNormalDate;
	private String tmonthYear;
	private int tId;
	private int tPresentDaysCount;
	private String lOtHours;
	private String lOtMinutes;

	public String getlOtHours() {
		return lOtHours;
	}

	public void setlOtHours(String lOtHours) {
		this.lOtHours = lOtHours;
	}

	public String getlOtMinutes() {
		return lOtMinutes;
	}

	public void setlOtMinutes(String lOtMinutes) {
		this.lOtMinutes = lOtMinutes;
	}

	public String gettEmployeeId() {
		return tEmployeeId;
	}

	public void settEmployeeId(String tEmployeeId) {
		this.tEmployeeId = tEmployeeId;
	}

	public String gettDate() {
		return tDate;
	}

	public void settDate(String tDate) {
		this.tDate = tDate;
	}

	public String gettPunchIn() {
		return tPunchIn;
	}

	public void settPunchIn(String tPunchIn) {
		this.tPunchIn = tPunchIn;
	}

	public String gettPunchInHour() {
		return tPunchInHour;
	}

	public void settPunchInHour(String tPunchInHour) {
		this.tPunchInHour = tPunchInHour;
	}

	public String gettPunchOut() {
		return tPunchOut;
	}

	public void settPunchOut(String tPunchOut) {
		this.tPunchOut = tPunchOut;
	}

	public String gettPunchOutHour() {
		return tPunchOutHour;
	}

	public void settPunchOutHour(String tPunchOutHour) {
		this.tPunchOutHour = tPunchOutHour;
	}

	public String gettBreak() {
		return tBreak;
	}

	public void settBreak(String tBreak) {
		this.tBreak = tBreak;
	}

	public String gettDuration() {
		return tDuration;
	}

	public void settDuration(String tDuration) {
		this.tDuration = tDuration;
	}

	public String gettCDate() {
		return tCDate;
	}

	public void settCDate(String tCDate) {
		this.tCDate = tCDate;
	}

	public String gettFirstName() {
		return tFirstName;
	}

	public void settFirstName(String tFirstName) {
		this.tFirstName = tFirstName;
	}

	public String gettDayInNumber() {
		return tDayInNumber;
	}

	public void settDayInNumber(String tDayInNumber) {
		this.tDayInNumber = tDayInNumber;
	}

	public String gettDayIntext() {
		return tDayIntext;
	}

	public void settDayIntext(String tDayIntext) {
		this.tDayIntext = tDayIntext;
	}

	public String gettOtHours() {
		return tOtHours;
	}

	public void settOtHours(String tOtHours) {
		this.tOtHours = tOtHours;
	}

	public String gettStatus() {
		return tStatus;
	}

	public void settStatus(String tStatus) {
		this.tStatus = tStatus;
	}

	public String gettShift() {
		return tShift;
	}

	public void settShift(String tShift) {
		this.tShift = tShift;
	}

	public String gettNormalDate() {
		return tNormalDate;
	}

	public void settNormalDate(String tNormalDate) {
		this.tNormalDate = tNormalDate;
	}

	public String getTmonthYear() {
		return tmonthYear;
	}

	public void setTmonthYear(String tmonthYear) {
		this.tmonthYear = tmonthYear;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public int gettPresentDaysCount() {
		return tPresentDaysCount;
	}

	public void settPresentDaysCount(int tPresentDaysCount) {
		this.tPresentDaysCount = tPresentDaysCount;
	}

	@Override
	public String toString() {
		return "TimeSheetBean [tEmployeeId=" + tEmployeeId + ", tDate=" + tDate + ", tPunchIn=" + tPunchIn
				+ ", tPunchInHour=" + tPunchInHour + ", tPunchOut=" + tPunchOut + ", tPunchOutHour=" + tPunchOutHour
				+ ", tBreak=" + tBreak + ", tDuration=" + tDuration + ", tCDate=" + tCDate + ", tFirstName="
				+ tFirstName + ", tDayInNumber=" + tDayInNumber + ", tDayIntext=" + tDayIntext + ", tOtHours="
				+ tOtHours + ", tStatus=" + tStatus + ", tShift=" + tShift + ", tNormalDate=" + tNormalDate
				+ ", tmonthYear=" + tmonthYear + ", tId=" + tId + ", tPresentDaysCount=" + tPresentDaysCount
				+ ", lOtHours=" + lOtHours + ", lOtMinutes=" + lOtMinutes + "]";
	}

}
