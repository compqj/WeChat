package com.example.demo.model;

public class User {
    private Integer stuid;

    private String name;

    private String password;

    private String phonenumber;

    private String specialty;

    private String grade;

    private String dormitory;

    private String role;

    private String wdwx;

    public User(Integer stuid, String name, String password, String phonenumber, String specialty, String grade, String dormitory, String role, String wdwx) {
        this.stuid = stuid;
        this.name = name;
        this.password = password;
        this.phonenumber = phonenumber;
        this.specialty = specialty;
        this.grade = grade;
        this.dormitory = dormitory;
        this.role = role;
        this.wdwx = wdwx;
    }

    public User() {
        super();
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getDormitory() {
        return dormitory;
    }

    public void setDormitory(String dormitory) {
        this.dormitory = dormitory == null ? null : dormitory.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getWdwx() {
        return wdwx;
    }

    public void setWdwx(String wdwx) {
        this.wdwx = wdwx == null ? null : wdwx.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "stuid=" + stuid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", specialty='" + specialty + '\'' +
                ", grade='" + grade + '\'' +
                ", dormitory='" + dormitory + '\'' +
                ", role='" + role + '\'' +
                ", wdwx='" + wdwx + '\'' +
                '}';
    }
}