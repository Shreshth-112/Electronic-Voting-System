package com.evs.votermicro.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Voter_Details")
public class Voter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String address;
    private Date dob;
    private String gender;
    private Long mobileNo;
    private Long pincode;

    public Voter(String name, String address, Date dob, String gender, Long mobileNo, Long pincode) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
        this.mobileNo = mobileNo;
        this.pincode = pincode;
    }
    public Voter() {
    }
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Long getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }
    public Long getPincode() {
        return pincode;
    }
    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }

}
