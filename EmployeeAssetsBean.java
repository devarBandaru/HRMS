package com.spthhrms.bean;

public class EmployeeAssetsBean {

	
	private int asset_Id;
	private String asset_Type;
	private String asset_Serial;
	private String asset_Brand;
	private String asset_Model;
	private String asset_Issued_Date;
	private String asset_Issued_Emp;
	private String asset_Issued_Department;
	public int getAsset_Id() {
		return asset_Id;
	}
	public void setAsset_Id(int asset_Id) {
		this.asset_Id = asset_Id;
	}
	public String getAsset_Type() {
		return asset_Type;
	}
	public void setAsset_Type(String asset_Type) {
		this.asset_Type = asset_Type;
	}
	public String getAsset_Serial() {
		return asset_Serial;
	}
	public void setAsset_Serial(String asset_Serial) {
		this.asset_Serial = asset_Serial;
	}
	public String getAsset_Brand() {
		return asset_Brand;
	}
	public void setAsset_Brand(String asset_Brand) {
		this.asset_Brand = asset_Brand;
	}
	public String getAsset_Model() {
		return asset_Model;
	}
	public void setAsset_Model(String asset_Model) {
		this.asset_Model = asset_Model;
	}
	public String getAsset_Issued_Date() {
		return asset_Issued_Date;
	}
	public void setAsset_Issued_Date(String asset_Issued_Date) {
		this.asset_Issued_Date = asset_Issued_Date;
	}
	public String getAsset_Issued_Emp() {
		return asset_Issued_Emp;
	}
	public void setAsset_Issued_Emp(String asset_Issued_Emp) {
		this.asset_Issued_Emp = asset_Issued_Emp;
	}
	public String getAsset_Issued_Department() {
		return asset_Issued_Department;
	}
	public void setAsset_Issued_Department(String asset_Issued_Department) {
		this.asset_Issued_Department = asset_Issued_Department;
	}
	@Override
	public String toString() {
		return "EmployeeAssetsBean [asset_Id=" + asset_Id + ", asset_Type=" + asset_Type + ", asset_Serial="
				+ asset_Serial + ", asset_Brand=" + asset_Brand + ", asset_Model=" + asset_Model
				+ ", asset_Issued_Date=" + asset_Issued_Date + ", asset_Issued_Emp=" + asset_Issued_Emp
				+ ", asset_Issued_Department=" + asset_Issued_Department + "]";
	}
	
	
	
}
