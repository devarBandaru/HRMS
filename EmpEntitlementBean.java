package com.spthhrms.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class EmpEntitlementBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer empEntitlementId;
	private Integer entitlementId;
	private String entitlementName;
	private String status;
	private String empId;
	private Timestamp createdTimestamp;

	public EmpEntitlementBean() {
	}

	public EmpEntitlementBean(String empId, String entitlementName, String status) {
		this.empId = empId;
		this.entitlementName = entitlementName;
		this.setStatus(status);
	}

	public Integer getEmpEntitlementId() {
		return empEntitlementId;
	}

	public void setEmpEntitlementId(Integer empEntitlementId) {
		this.empEntitlementId = empEntitlementId;
	}

	public String getEntitlementName() {
		return entitlementName;
	}

	public void setEntitlementName(String entitlementName) {
		this.entitlementName = entitlementName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public Integer getEntitlementId() {
		return entitlementId;
	}

	public void setEntitlementId(Integer entitlementId) {
		this.entitlementId = entitlementId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "EmpEntitlementBean [empEntitlementId=" + empEntitlementId + ", entitlementId=" + entitlementId
				+ ", entitlementName=" + entitlementName + ", status=" + status + ", empId=" + empId
				+ ", createdTimestamp=" + createdTimestamp + "]";
	}

}
