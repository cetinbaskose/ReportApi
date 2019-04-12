package com.example.reportapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name ="id")
	private Long id;
	
	
	@CreatedDate
	@Column(name ="created_at")
	Date created_at;
	
	@LastModifiedDate
	@Column(name ="updated_at")
	Date updated_at;
	
	@Column(name ="deleted_at")
	Date deleted_at;
	
	@Column(name ="number")
	long number;
	
	@Column(name ="expirymonth")
	String expiryMonth;
	
	@Column(name ="expiryyear")
	String expiryYear;
	
	@Column(name ="startmonth")
	String startMonth;
	
	@Column(name ="startyear")
	String startYear;
	
	@Column(name ="issuenumber")
	long issueNumber;
	
	@Column(name ="email")
	String email;
	
	@Column(name ="birthday")
	Date birthday;
	
	@Column(name ="gender")
	String gender;
	
	@Column(name ="billingtitle")
	String billingTitle;
	
	@Column(name ="billingfirstname")
	String billingFirstName;
	
	@Column(name ="billinglastname")
	String billingLastName;
	
	@Column(name ="billingcompany")
	String billingCompany;

	@Column(name ="billingaddress1")
	String billingaddress1;
	
	@Column(name ="billingaddress2")
	String billingAddress2;
	
	@Column(name ="billingcity")
	String billingCity;
	
	@Column(name ="billingpostcode")
	String billingPostcode;
	
	@Column(name ="billingstate")
	String billingState;
	
	@Column(name ="billingcountry")
	String billingCountry;
	
	@Column(name ="billingphone")
	String billingPhone;
	
	@Column(name ="billingfax")
	String billingFax;
	
	@Column(name ="shippingtitle")
	String shippingTitle;
	
	@Column(name ="shippingfirstname")
	String shippingFirstName;
	
	@Column(name ="shippinglastname")
	String shippingLastName;
	
	@Column(name ="shippingcompany")
	String shippingCompany;
	
	@Column(name ="shippingaddress1")
	String shippingAddress1;
	
	@Column(name ="shippingaddress2")
	String shippingAddress2;
	
	@Column(name ="shippingcity")
	String shippingCity;
	
	@Column(name ="shippingpostcode")
	String shippingPostcode;
	
	@Column(name ="shippingstate")
	String shippingState;
	
	@Column(name ="shippingcountry")
	String shippingCountry;
	
	@Column(name ="shippingphone")
	String shippingPhone;
	
	@Column(name ="shippingfax")
	String shippingFax;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getDeleted_at() {
		return deleted_at;
	}

	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public String getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}

	public String getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public long getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(long issueNumber) {
		this.issueNumber = issueNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBillingTitle() {
		return billingTitle;
	}

	public void setBillingTitle(String billingTitle) {
		this.billingTitle = billingTitle;
	}

	public String getBillingFirstName() {
		return billingFirstName;
	}

	public void setBillingFirstName(String billingFirstName) {
		this.billingFirstName = billingFirstName;
	}

	public String getBillingLastName() {
		return billingLastName;
	}

	public void setBillingLastName(String billingLastName) {
		this.billingLastName = billingLastName;
	}

	public String getBillingCompany() {
		return billingCompany;
	}

	public void setBillingCompany(String billingCompany) {
		this.billingCompany = billingCompany;
	}

	public String getBillingaddress1() {
		return billingaddress1;
	}

	public void setBillingaddress1(String billingaddress1) {
		this.billingaddress1 = billingaddress1;
	}

	public String getBillingAddress2() {
		return billingAddress2;
	}

	public void setBillingAddress2(String billingAddress2) {
		this.billingAddress2 = billingAddress2;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	public String getBillingPostcode() {
		return billingPostcode;
	}

	public void setBillingPostcode(String billingPostcode) {
		this.billingPostcode = billingPostcode;
	}

	public String getBillingState() {
		return billingState;
	}

	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}

	public String getBillingCountry() {
		return billingCountry;
	}

	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}

	public String getBillingPhone() {
		return billingPhone;
	}

	public void setBillingPhone(String billingPhone) {
		this.billingPhone = billingPhone;
	}

	public String getBillingFax() {
		return billingFax;
	}

	public void setBillingFax(String billingFax) {
		this.billingFax = billingFax;
	}

	public String getShippingTitle() {
		return shippingTitle;
	}

	public void setShippingTitle(String shippingTitle) {
		this.shippingTitle = shippingTitle;
	}

	public String getShippingFirstName() {
		return shippingFirstName;
	}

	public void setShippingFirstName(String shippingFirstName) {
		this.shippingFirstName = shippingFirstName;
	}

	public String getShippingLastName() {
		return shippingLastName;
	}

	public void setShippingLastName(String shippingLastName) {
		this.shippingLastName = shippingLastName;
	}

	public String getShippingCompany() {
		return shippingCompany;
	}

	public void setShippingCompany(String shippingCompany) {
		this.shippingCompany = shippingCompany;
	}

	public String getShippingAddress1() {
		return shippingAddress1;
	}

	public void setShippingAddress1(String shippingAddress1) {
		this.shippingAddress1 = shippingAddress1;
	}

	public String getShippingAddress2() {
		return shippingAddress2;
	}

	public void setShippingAddress2(String shippingAddress2) {
		this.shippingAddress2 = shippingAddress2;
	}

	public String getShippingCity() {
		return shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public String getShippingPostcode() {
		return shippingPostcode;
	}

	public void setShippingPostcode(String shippingPostcode) {
		this.shippingPostcode = shippingPostcode;
	}

	public String getShippingState() {
		return shippingState;
	}

	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}

	public String getShippingCountry() {
		return shippingCountry;
	}

	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	public String getShippingPhone() {
		return shippingPhone;
	}

	public void setShippingPhone(String shippingPhone) {
		this.shippingPhone = shippingPhone;
	}

	public String getShippingFax() {
		return shippingFax;
	}

	public void setShippingFax(String shippingFax) {
		this.shippingFax = shippingFax;
	}

}
