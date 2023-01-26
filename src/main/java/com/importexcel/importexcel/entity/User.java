package com.importexcel.importexcel.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String empNo;
    private String supervisorName;
    private String positionName;
    private String managerName;
    private String employeeName;
    private String supervisorNik;
    private String endDate;
    private String department;
    private String worklocationName;
    private String worklocationCode;
    private String managerNik;
    private String email;
    private String deptHeadUp1;
    private String deptHeadUp2;

    private Date createdDate;
    private Date updatedDate;
    private String createdBy;
    private String updatedBy;

    public User() {
    }

    public User(String empNo, String supervisorName, String positionName, String managerName, String employeeName, String supervisorNik, String endDate, String department, String worklocationName, String worklocationCode, String managerNik, String email, String deptHeadUp1, String deptHeadUp2, Date createdDate, Date updatedDate, String createdBy, String updatedBy) {
        this.empNo = empNo;
        this.supervisorName = supervisorName;
        this.positionName = positionName;
        this.managerName = managerName;
        this.employeeName = employeeName;
        this.supervisorNik = supervisorNik;
        this.endDate = endDate;
        this.department = department;
        this.worklocationName = worklocationName;
        this.worklocationCode = worklocationCode;
        this.managerNik = managerNik;
        this.email = email;
        this.deptHeadUp1 = deptHeadUp1;
        this.deptHeadUp2 = deptHeadUp2;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getSupervisorNik() {
        return supervisorNik;
    }

    public void setSupervisorNik(String supervisorNik) {
        this.supervisorNik = supervisorNik;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorklocationName() {
        return worklocationName;
    }

    public void setWorklocationName(String worklocationName) {
        this.worklocationName = worklocationName;
    }

    public String getWorklocationCode() {
        return worklocationCode;
    }

    public void setWorklocationCode(String worklocationCode) {
        this.worklocationCode = worklocationCode;
    }

    public String getManagerNik() {
        return managerNik;
    }

    public void setManagerNik(String managerNik) {
        this.managerNik = managerNik;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeptHeadUp1() {
        return deptHeadUp1;
    }

    public void setDeptHeadUp1(String deptHeadUp1) {
        this.deptHeadUp1 = deptHeadUp1;
    }

    public String getDeptHeadUp2() {
        return deptHeadUp2;
    }

    public void setDeptHeadUp2(String deptHeadUp2) {
        this.deptHeadUp2 = deptHeadUp2;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
