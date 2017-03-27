
package com.miguelcr.loginapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("ip_address")
    @Expose
    private String ipAddress;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("salt")
    @Expose
    private String salt;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("activation_code")
    @Expose
    private String activationCode;
    @SerializedName("forgotten_password_code")
    @Expose
    private Object forgottenPasswordCode;
    @SerializedName("forgotten_password_time")
    @Expose
    private Object forgottenPasswordTime;
    @SerializedName("remember_code")
    @Expose
    private Object rememberCode;
    @SerializedName("created_on")
    @Expose
    private String createdOn;
    @SerializedName("last_login")
    @Expose
    private String lastLogin;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("phone")
    @Expose
    private String phone;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param lastName
     * @param phone
     * @param password
     * @param id
     * @param createdOn
     * @param username
     * @param lastLogin
     * @param rememberCode
     * @param email
     * @param forgottenPasswordCode
     * @param company
     * @param activationCode
     * @param forgottenPasswordTime
     * @param active
     * @param firstName
     * @param ipAddress
     * @param salt
     */
    public Data(String id, String ipAddress, String username, String password, String salt, String email, String activationCode, Object forgottenPasswordCode, Object forgottenPasswordTime, Object rememberCode, String createdOn, String lastLogin, String active, String firstName, String lastName, String company, String phone) {
        super();
        this.id = id;
        this.ipAddress = ipAddress;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.activationCode = activationCode;
        this.forgottenPasswordCode = forgottenPasswordCode;
        this.forgottenPasswordTime = forgottenPasswordTime;
        this.rememberCode = rememberCode;
        this.createdOn = createdOn;
        this.lastLogin = lastLogin;
        this.active = active;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Data withId(String id) {
        this.id = id;
        return this;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Data withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Data withUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Data withPassword(String password) {
        this.password = password;
        return this;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Data withSalt(String salt) {
        this.salt = salt;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Data withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public Data withActivationCode(String activationCode) {
        this.activationCode = activationCode;
        return this;
    }

    public Object getForgottenPasswordCode() {
        return forgottenPasswordCode;
    }

    public void setForgottenPasswordCode(Object forgottenPasswordCode) {
        this.forgottenPasswordCode = forgottenPasswordCode;
    }

    public Data withForgottenPasswordCode(Object forgottenPasswordCode) {
        this.forgottenPasswordCode = forgottenPasswordCode;
        return this;
    }

    public Object getForgottenPasswordTime() {
        return forgottenPasswordTime;
    }

    public void setForgottenPasswordTime(Object forgottenPasswordTime) {
        this.forgottenPasswordTime = forgottenPasswordTime;
    }

    public Data withForgottenPasswordTime(Object forgottenPasswordTime) {
        this.forgottenPasswordTime = forgottenPasswordTime;
        return this;
    }

    public Object getRememberCode() {
        return rememberCode;
    }

    public void setRememberCode(Object rememberCode) {
        this.rememberCode = rememberCode;
    }

    public Data withRememberCode(Object rememberCode) {
        this.rememberCode = rememberCode;
        return this;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public Data withCreatedOn(String createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Data withLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
        return this;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Data withActive(String active) {
        this.active = active;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Data withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Data withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Data withCompany(String company) {
        this.company = company;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Data withPhone(String phone) {
        this.phone = phone;
        return this;
    }

}
