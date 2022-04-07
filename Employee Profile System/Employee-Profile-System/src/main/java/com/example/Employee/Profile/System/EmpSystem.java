package com.example.Employee.Profile.System;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class EmpSystem {
    private long EmployeeCode;
    private String FirstName;
    private String LastName;
    private Date DateOfBirth;
    private Date DateOfJoining;
    private String Email;
    private long Salary;

    protected EmpSystem(){
    }

    public EmpSystem(long employeeCode, String firstName, String lastName, Date dateOfBirth, Date dateOfJoining, String email, long salary) {
        this.EmployeeCode = employeeCode;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.DateOfBirth = dateOfBirth;
        this.DateOfJoining = dateOfJoining;
        this.Email = email;
        this.Salary = salary;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public long getEmployeeCode() {
        return EmployeeCode;
    }

    public void setEmployeeCode(long employeeCode) {
        EmployeeCode = employeeCode;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public Date getDateOfJoining() {
        return DateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        DateOfJoining = dateOfJoining;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(long salary) {
        Salary = salary;
    }
}
