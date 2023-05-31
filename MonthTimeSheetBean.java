
package com.spthhrms.bean;

import java.util.ArrayList;
import java.util.List;

public class MonthTimeSheetBean {

	private String employeeId;

	private String firstName;

	private List<TimeEntryBean> timeEntrys = new ArrayList<>();

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setTimeEntrys(List<TimeEntryBean> timeEntrys) {
		this.timeEntrys = timeEntrys;
	}

	public void addTimeEntry(TimeEntryBean timeEntry) {
		this.timeEntrys.add(timeEntry);
	}

	public List<TimeEntryBean> getTimeEntrys() {
		return timeEntrys;
	}

	@Override
	public String toString() {
		return "MonthTimeSheetBean [employeeId=" + employeeId + ", firstName=" + firstName + ", timeEntrys="
				+ timeEntrys + "]";
	}

}
