package com.spthhrms.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class EntitlementBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer entitlementId;
	private String entitlementName;
	private String entitlementType;
	private Timestamp createdTimestamp;

	public EntitlementBean() {

	}

	public EntitlementBean(Integer entitlementId, String entitlementName, String entitlementType) {
		super();
		this.entitlementId = entitlementId;
		this.entitlementName = entitlementName;
		this.entitlementType = entitlementType;
	}

	public Integer getEntitlementId() {
		return entitlementId;
	}

	public void setEntitlementId(Integer entitlementId) {
		this.entitlementId = entitlementId;
	}

	public String getEntitlementName() {
		return entitlementName;
	}

	public void setEntitlementName(String entitlementName) {
		this.entitlementName = entitlementName;
	}

	public String getEntitlementType() {
		return entitlementType;
	}

	public void setEntitlementType(String entitlementType) {
		this.entitlementType = entitlementType;
	}

	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	@Override
	public String toString() {
		return "EntitlementBean [entitlementId=" + entitlementId + ", entitlementName=" + entitlementName
				+ ", entitlementType=" + entitlementType + ", createdTimestamp=" + createdTimestamp + "]";
	}
}
