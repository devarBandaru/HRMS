package com.spthhrms.bean;

import java.io.InputStream;

public class Employee {
	private String eEmpId;
	  private String eFirstName;
	  private String eLastName;
	  private String eDob;
	  private String eGender;
	  private String eIdName;//id proof name
	  private String eIdNumber;//id number
	  private String eEMail;
	  private String eMobile;
	  private String eIdentityMarks1;
	  private String eIdentityMarks2;
	  private String eFatherName;
	  private String eMotherName;
	  private String eMarritalStatus;
	  private String eSpouseName;
	  private String eSpouseContact;
	  private String eEmergencyNo;
	  private String eBloodGroup;
	  private String eCAddress1;//current address
	  private String eCAddress2;
	  private String eCAddress3;//city name
	  private String eCAddress4;//State name
	  private String eCAddress5;//Country name
	  private String eCPincode;
	  private String eCurrentPermanentAddSame;
	  private String ePAddress1;//permanent address
	  private String ePAddress2;
	  private String ePAddress3;//city name
	  private String ePAddress4;//State name
	  private String ePAddress5;//Country name
	  private String ePPincode;
	  private String eReferName;
	  private String eReferPhone;
	  private String eDate;
	  protected InputStream ePassPhoto;
	  protected InputStream eIdPhoto;
	  
	  //academic detatils
	  //school
	  private String eSchoolName; 
	  private String eSchoolPassYear;
	  private String eSchoolPercentage;
	  private String eShoolPlace;
	  protected InputStream eSchoolCertificate;
	  //Undergraduate 
	  private String eUGCollegeName;
	  private String eUGPassYear;
	  private String eUGPercentage;
	  private String eUGPlace;
	  protected InputStream eUGCertificate;
	  //Graduation 
	  private String eGCollegeName;
	  private String eGUniversity;
	  private String eGPercentage;
	  private String eGPassYear;
	  protected InputStream eGCertificate;
	  //Post Graduation
	  private String ePGCollegeName;
	  private String ePGUniversity;
	  private String ePGPercentage;
	  private String ePGPassYear;
	  protected InputStream ePGCertificate;
	  //Diploma 
	  private String eDiplomaCollegeName;
	  private String eDiplomaPassYear;
	  private String eDiplomaPercentage;
	  private String eDiplomaPlace;
	  protected InputStream eDiplomaCertificate;
	  //Any Certificates
	  private String eTechnologyName1;
	  private String eTechnologyName2;
	  private String eTechnologyName3;
	  private String eTechnologyName4;
	  protected InputStream eTechnologyCertificate;
	  //Tax Details
	  private String eTaxName;
	  private String eTaxNumber;
	  protected InputStream eTaxDocument;
	  //Banking Detai
	  private String eBankName;
	  private String eBranchName;
	  private String eBankAccount;
	  private String eBankIfsc;
	  protected InputStream eBankDocument;
	public String geteEmpId() {
		return eEmpId;
	}
	public void seteEmpId(String eEmpId) {
		this.eEmpId = eEmpId;
	}
	public String geteFirstName() {
		return eFirstName;
	}
	public void seteFirstName(String eFirstName) {
		this.eFirstName = eFirstName;
	}
	public String geteLastName() {
		return eLastName;
	}
	public void seteLastName(String eLastName) {
		this.eLastName = eLastName;
	}
	public String geteDob() {
		return eDob;
	}
	public void seteDob(String eDob) {
		this.eDob = eDob;
	}
	public String geteGender() {
		return eGender;
	}
	public void seteGender(String eGender) {
		this.eGender = eGender;
	}
	public String geteIdName() {
		return eIdName;
	}
	public void seteIdName(String eIdName) {
		this.eIdName = eIdName;
	}
	public String geteIdNumber() {
		return eIdNumber;
	}
	public void seteIdNumber(String eIdNumber) {
		this.eIdNumber = eIdNumber;
	}
	public String geteEMail() {
		return eEMail;
	}
	public void seteEMail(String eEMail) {
		this.eEMail = eEMail;
	}
	public String geteMobile() {
		return eMobile;
	}
	public void seteMobile(String eMobile) {
		this.eMobile = eMobile;
	}
	public String geteIdentityMarks1() {
		return eIdentityMarks1;
	}
	public void seteIdentityMarks1(String eIdentityMarks1) {
		this.eIdentityMarks1 = eIdentityMarks1;
	}
	public String geteIdentityMarks2() {
		return eIdentityMarks2;
	}
	public void seteIdentityMarks2(String eIdentityMarks2) {
		this.eIdentityMarks2 = eIdentityMarks2;
	}
	public String geteFatherName() {
		return eFatherName;
	}
	public void seteFatherName(String eFatherName) {
		this.eFatherName = eFatherName;
	}
	public String geteMotherName() {
		return eMotherName;
	}
	public void seteMotherName(String eMotherName) {
		this.eMotherName = eMotherName;
	}
	public String geteMarritalStatus() {
		return eMarritalStatus;
	}
	public void seteMarritalStatus(String eMarritalStatus) {
		this.eMarritalStatus = eMarritalStatus;
	}
	public String geteSpouseName() {
		return eSpouseName;
	}
	public void seteSpouseName(String eSpouseName) {
		this.eSpouseName = eSpouseName;
	}
	public String geteSpouseContact() {
		return eSpouseContact;
	}
	public void seteSpouseContact(String eSpouseContact) {
		this.eSpouseContact = eSpouseContact;
	}
	public String geteEmergencyNo() {
		return eEmergencyNo;
	}
	public void seteEmergencyNo(String eEmergencyNo) {
		this.eEmergencyNo = eEmergencyNo;
	}
	public String geteBloodGroup() {
		return eBloodGroup;
	}
	public void seteBloodGroup(String eBloodGroup) {
		this.eBloodGroup = eBloodGroup;
	}
	public String geteCAddress1() {
		return eCAddress1;
	}
	public void seteCAddress1(String eCAddress1) {
		this.eCAddress1 = eCAddress1;
	}
	public String geteCAddress2() {
		return eCAddress2;
	}
	public void seteCAddress2(String eCAddress2) {
		this.eCAddress2 = eCAddress2;
	}
	public String geteCAddress3() {
		return eCAddress3;
	}
	public void seteCAddress3(String eCAddress3) {
		this.eCAddress3 = eCAddress3;
	}
	public String geteCAddress4() {
		return eCAddress4;
	}
	public void seteCAddress4(String eCAddress4) {
		this.eCAddress4 = eCAddress4;
	}
	public String geteCAddress5() {
		return eCAddress5;
	}
	public void seteCAddress5(String eCAddress5) {
		this.eCAddress5 = eCAddress5;
	}
	public String geteCPincode() {
		return eCPincode;
	}
	public void seteCPincode(String eCPincode) {
		this.eCPincode = eCPincode;
	}
	public String geteCurrentPermanentAddSame() {
		return eCurrentPermanentAddSame;
	}
	public void seteCurrentPermanentAddSame(String eCurrentPermanentAddSame) {
		this.eCurrentPermanentAddSame = eCurrentPermanentAddSame;
	}
	public String getePAddress1() {
		return ePAddress1;
	}
	public void setePAddress1(String ePAddress1) {
		this.ePAddress1 = ePAddress1;
	}
	public String getePAddress2() {
		return ePAddress2;
	}
	public void setePAddress2(String ePAddress2) {
		this.ePAddress2 = ePAddress2;
	}
	public String getePAddress3() {
		return ePAddress3;
	}
	public void setePAddress3(String ePAddress3) {
		this.ePAddress3 = ePAddress3;
	}
	public String getePAddress4() {
		return ePAddress4;
	}
	public void setePAddress4(String ePAddress4) {
		this.ePAddress4 = ePAddress4;
	}
	public String getePAddress5() {
		return ePAddress5;
	}
	public void setePAddress5(String ePAddress5) {
		this.ePAddress5 = ePAddress5;
	}
	public String getePPincode() {
		return ePPincode;
	}
	public void setePPincode(String ePPincode) {
		this.ePPincode = ePPincode;
	}
	public String geteReferName() {
		return eReferName;
	}
	public void seteReferName(String eReferName) {
		this.eReferName = eReferName;
	}
	public String geteReferPhone() {
		return eReferPhone;
	}
	public void seteReferPhone(String eReferPhone) {
		this.eReferPhone = eReferPhone;
	}
	public String geteDate() {
		return eDate;
	}
	public void seteDate(String eDate) {
		this.eDate = eDate;
	}
	public InputStream getePassPhoto() {
		return ePassPhoto;
	}
	public void setePassPhoto(InputStream ePassPhoto) {
		this.ePassPhoto = ePassPhoto;
	}
	public InputStream geteIdPhoto() {
		return eIdPhoto;
	}
	public void seteIdPhoto(InputStream eIdPhoto) {
		this.eIdPhoto = eIdPhoto;
	}
	public String geteSchoolName() {
		return eSchoolName;
	}
	public void seteSchoolName(String eSchoolName) {
		this.eSchoolName = eSchoolName;
	}
	public String geteSchoolPassYear() {
		return eSchoolPassYear;
	}
	public void seteSchoolPassYear(String eSchoolPassYear) {
		this.eSchoolPassYear = eSchoolPassYear;
	}
	public String geteSchoolPercentage() {
		return eSchoolPercentage;
	}
	public void seteSchoolPercentage(String eSchoolPercentage) {
		this.eSchoolPercentage = eSchoolPercentage;
	}
	public String geteShoolPlace() {
		return eShoolPlace;
	}
	public void seteShoolPlace(String eShoolPlace) {
		this.eShoolPlace = eShoolPlace;
	}
	public InputStream geteSchoolCertificate() {
		return eSchoolCertificate;
	}
	public void seteSchoolCertificate(InputStream eSchoolCertificate) {
		this.eSchoolCertificate = eSchoolCertificate;
	}
	public String geteUGCollegeName() {
		return eUGCollegeName;
	}
	public void seteUGCollegeName(String eUGCollegeName) {
		this.eUGCollegeName = eUGCollegeName;
	}
	public String geteUGPassYear() {
		return eUGPassYear;
	}
	public void seteUGPassYear(String eUGPassYear) {
		this.eUGPassYear = eUGPassYear;
	}
	public String geteUGPercentage() {
		return eUGPercentage;
	}
	public void seteUGPercentage(String eUGPercentage) {
		this.eUGPercentage = eUGPercentage;
	}
	public String geteUGPlace() {
		return eUGPlace;
	}
	public void seteUGPlace(String eUGPlace) {
		this.eUGPlace = eUGPlace;
	}
	public InputStream geteUGCertificate() {
		return eUGCertificate;
	}
	public void seteUGCertificate(InputStream eUGCertificate) {
		this.eUGCertificate = eUGCertificate;
	}
	public String geteGCollegeName() {
		return eGCollegeName;
	}
	public void seteGCollegeName(String eGCollegeName) {
		this.eGCollegeName = eGCollegeName;
	}
	public String geteGUniversity() {
		return eGUniversity;
	}
	public void seteGUniversity(String eGUniversity) {
		this.eGUniversity = eGUniversity;
	}
	public String geteGPercentage() {
		return eGPercentage;
	}
	public void seteGPercentage(String eGPercentage) {
		this.eGPercentage = eGPercentage;
	}
	public String geteGPassYear() {
		return eGPassYear;
	}
	public void seteGPassYear(String eGPassYear) {
		this.eGPassYear = eGPassYear;
	}
	public InputStream geteGCertificate() {
		return eGCertificate;
	}
	public void seteGCertificate(InputStream eGCertificate) {
		this.eGCertificate = eGCertificate;
	}
	public String getePGCollegeName() {
		return ePGCollegeName;
	}
	public void setePGCollegeName(String ePGCollegeName) {
		this.ePGCollegeName = ePGCollegeName;
	}
	public String getePGUniversity() {
		return ePGUniversity;
	}
	public void setePGUniversity(String ePGUniversity) {
		this.ePGUniversity = ePGUniversity;
	}
	public String getePGPercentage() {
		return ePGPercentage;
	}
	public void setePGPercentage(String ePGPercentage) {
		this.ePGPercentage = ePGPercentage;
	}
	public String getePGPassYear() {
		return ePGPassYear;
	}
	public void setePGPassYear(String ePGPassYear) {
		this.ePGPassYear = ePGPassYear;
	}
	public InputStream getePGCertificate() {
		return ePGCertificate;
	}
	public void setePGCertificate(InputStream ePGCertificate) {
		this.ePGCertificate = ePGCertificate;
	}
	public String geteDiplomaCollegeName() {
		return eDiplomaCollegeName;
	}
	public void seteDiplomaCollegeName(String eDiplomaCollegeName) {
		this.eDiplomaCollegeName = eDiplomaCollegeName;
	}
	public String geteDiplomaPassYear() {
		return eDiplomaPassYear;
	}
	public void seteDiplomaPassYear(String eDiplomaPassYear) {
		this.eDiplomaPassYear = eDiplomaPassYear;
	}
	public String geteDiplomaPercentage() {
		return eDiplomaPercentage;
	}
	public void seteDiplomaPercentage(String eDiplomaPercentage) {
		this.eDiplomaPercentage = eDiplomaPercentage;
	}
	public String geteDiplomaPlace() {
		return eDiplomaPlace;
	}
	public void seteDiplomaPlace(String eDiplomaPlace) {
		this.eDiplomaPlace = eDiplomaPlace;
	}
	public InputStream geteDiplomaCertificate() {
		return eDiplomaCertificate;
	}
	public void seteDiplomaCertificate(InputStream eDiplomaCertificate) {
		this.eDiplomaCertificate = eDiplomaCertificate;
	}
	public String geteTechnologyName1() {
		return eTechnologyName1;
	}
	public void seteTechnologyName1(String eTechnologyName1) {
		this.eTechnologyName1 = eTechnologyName1;
	}
	public String geteTechnologyName2() {
		return eTechnologyName2;
	}
	public void seteTechnologyName2(String eTechnologyName2) {
		this.eTechnologyName2 = eTechnologyName2;
	}
	public String geteTechnologyName3() {
		return eTechnologyName3;
	}
	public void seteTechnologyName3(String eTechnologyName3) {
		this.eTechnologyName3 = eTechnologyName3;
	}
	public String geteTechnologyName4() {
		return eTechnologyName4;
	}
	public void seteTechnologyName4(String eTechnologyName4) {
		this.eTechnologyName4 = eTechnologyName4;
	}
	public InputStream geteTechnologyCertificate() {
		return eTechnologyCertificate;
	}
	public void seteTechnologyCertificate(InputStream eTechnologyCertificate) {
		this.eTechnologyCertificate = eTechnologyCertificate;
	}
	public String geteTaxName() {
		return eTaxName;
	}
	public void seteTaxName(String eTaxName) {
		this.eTaxName = eTaxName;
	}
	public String geteTaxNumber() {
		return eTaxNumber;
	}
	public void seteTaxNumber(String eTaxNumber) {
		this.eTaxNumber = eTaxNumber;
	}
	public InputStream geteTaxDocument() {
		return eTaxDocument;
	}
	public void seteTaxDocument(InputStream eTaxDocument) {
		this.eTaxDocument = eTaxDocument;
	}
	public String geteBankName() {
		return eBankName;
	}
	public void seteBankName(String eBankName) {
		this.eBankName = eBankName;
	}
	public String geteBranchName() {
		return eBranchName;
	}
	public void seteBranchName(String eBranchName) {
		this.eBranchName = eBranchName;
	}
	public String geteBankAccount() {
		return eBankAccount;
	}
	public void seteBankAccount(String eBankAccount) {
		this.eBankAccount = eBankAccount;
	}
	public String geteBankIfsc() {
		return eBankIfsc;
	}
	public void seteBankIfsc(String eBankIfsc) {
		this.eBankIfsc = eBankIfsc;
	}
	public InputStream geteBankDocument() {
		return eBankDocument;
	}
	public void seteBankDocument(InputStream eBankDocument) {
		this.eBankDocument = eBankDocument;
	}
	@Override
	public String toString() {
		return "Employee [eEmpId=" + eEmpId + ", eFirstName=" + eFirstName + ", eLastName=" + eLastName + ", eDob="
				+ eDob + ", eGender=" + eGender + ", eIdName=" + eIdName + ", eIdNumber=" + eIdNumber + ", eEMail="
				+ eEMail + ", eMobile=" + eMobile + ", eIdentityMarks1=" + eIdentityMarks1 + ", eIdentityMarks2="
				+ eIdentityMarks2 + ", eFatherName=" + eFatherName + ", eMotherName=" + eMotherName
				+ ", eMarritalStatus=" + eMarritalStatus + ", eSpouseName=" + eSpouseName + ", eSpouseContact="
				+ eSpouseContact + ", eEmergencyNo=" + eEmergencyNo + ", eBloodGroup=" + eBloodGroup + ", eCAddress1="
				+ eCAddress1 + ", eCAddress2=" + eCAddress2 + ", eCAddress3=" + eCAddress3 + ", eCAddress4="
				+ eCAddress4 + ", eCAddress5=" + eCAddress5 + ", eCPincode=" + eCPincode + ", eCurrentPermanentAddSame="
				+ eCurrentPermanentAddSame + ", ePAddress1=" + ePAddress1 + ", ePAddress2=" + ePAddress2
				+ ", ePAddress3=" + ePAddress3 + ", ePAddress4=" + ePAddress4 + ", ePAddress5=" + ePAddress5
				+ ", ePPincode=" + ePPincode + ", eReferName=" + eReferName + ", eReferPhone=" + eReferPhone
				+ ", eDate=" + eDate + ", ePassPhoto=" + ePassPhoto + ", eIdPhoto=" + eIdPhoto + ", eSchoolName="
				+ eSchoolName + ", eSchoolPassYear=" + eSchoolPassYear + ", eSchoolPercentage=" + eSchoolPercentage
				+ ", eShoolPlace=" + eShoolPlace + ", eSchoolCertificate=" + eSchoolCertificate + ", eUGCollegeName="
				+ eUGCollegeName + ", eUGPassYear=" + eUGPassYear + ", eUGPercentage=" + eUGPercentage + ", eUGPlace="
				+ eUGPlace + ", eUGCertificate=" + eUGCertificate + ", eGCollegeName=" + eGCollegeName
				+ ", eGUniversity=" + eGUniversity + ", eGPercentage=" + eGPercentage + ", eGPassYear=" + eGPassYear
				+ ", eGCertificate=" + eGCertificate + ", ePGCollegeName=" + ePGCollegeName + ", ePGUniversity="
				+ ePGUniversity + ", ePGPercentage=" + ePGPercentage + ", ePGPassYear=" + ePGPassYear
				+ ", ePGCertificate=" + ePGCertificate + ", eDiplomaCollegeName=" + eDiplomaCollegeName
				+ ", eDiplomaPassYear=" + eDiplomaPassYear + ", eDiplomaPercentage=" + eDiplomaPercentage
				+ ", eDiplomaPlace=" + eDiplomaPlace + ", eDiplomaCertificate=" + eDiplomaCertificate
				+ ", eTechnologyName1=" + eTechnologyName1 + ", eTechnologyName2=" + eTechnologyName2
				+ ", eTechnologyName3=" + eTechnologyName3 + ", eTechnologyName4=" + eTechnologyName4
				+ ", eTechnologyCertificate=" + eTechnologyCertificate + ", eTaxName=" + eTaxName + ", eTaxNumber="
				+ eTaxNumber + ", eTaxDocument=" + eTaxDocument + ", eBankName=" + eBankName + ", eBranchName="
				+ eBranchName + ", eBankAccount=" + eBankAccount + ", eBankIfsc=" + eBankIfsc + ", eBankDocument="
				+ eBankDocument + "]";
	}
	  
	  
	
	
	
}
	
