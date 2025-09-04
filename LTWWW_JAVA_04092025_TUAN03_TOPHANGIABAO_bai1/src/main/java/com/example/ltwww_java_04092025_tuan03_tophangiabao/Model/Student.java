package com.example.ltwww_java_04092025_tuan03_tophangiabao.Model;

import com.example.ltwww_java_04092025_tuan03_tophangiabao.Enum.Course;
import com.example.ltwww_java_04092025_tuan03_tophangiabao.Enum.Gender;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String email;
    private String mobileNum;
    private Gender gender;
    private String address;
    private String city;
    private String pincode;
    private String state;
    private String country;
    private String hobbies;
    private Course appliedCourse;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public Course getAppliedCourse() {
        return appliedCourse;
    }

    public void setAppliedCourse(Course appliedCourse) {
        this.appliedCourse = appliedCourse;
    }
}
