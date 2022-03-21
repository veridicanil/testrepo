package com.customer.info.modals;

import java.sql.Timestamp;

public class Customer {

    public Long customerid;
    public String firstname;
    public String middlename;
    public String lastname;
    public String emailaddress;
    public String contactnumber;
    public String addressline1;
    public String addressline2;
    public String addressline3;
    public Integer countryid;
    public String state;
    public String statecode;
    public String city;
    public String postcode;
    public Timestamp createddateutc;
    public Timestamp modifieddateutc;
    public boolean isactive;
    
    public Long getCustomerid() {
        return customerid;
    }
    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getMiddlename() {
        return middlename;
    }
    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmailaddress() {
        return emailaddress;
    }
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
    public String getContactnumber() {
        return contactnumber;
    }
    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }
    public String getAddressline1() {
        return addressline1;
    }
    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }
    public String getAddressline2() {
        return addressline2;
    }
    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }
    public String getAddressline3() {
        return addressline3;
    }
    public void setAddressline3(String addressline3) {
        this.addressline3 = addressline3;
    }
    public Integer getCountryid() {
        return countryid;
    }
    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getStatecode() {
        return statecode;
    }
    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public Timestamp getCreateddateutc() {
        return createddateutc;
    }
    public void setCreateddateutc(Timestamp createddateutc) {
        this.createddateutc = createddateutc;
    }
    public Timestamp getModifieddateutc() {
        return modifieddateutc;
    }
    public void setModifieddateutc(Timestamp modifieddateutc) {
        this.modifieddateutc = modifieddateutc;
    }
    public boolean isIsactive() {
        return isactive;
    }
    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }
    
    
    

}
