package com.aws.codestar.projecttemplates.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {

    @Id
    @GeneratedValue
    private Integer adminId;

    /**
     * Имя админа
     */
    private String adminFirstName;

    /**
     * Фамилия админа
     */
    private String adminLastName;

    public Admin(Integer adminId, String adminFirstName, String adminLastName) {
        this.adminId = adminId;
        this.adminFirstName = adminFirstName;
        this.adminLastName = adminLastName;
    }

    public Admin(String adminFirstName, String adminLastName) {
        this.adminFirstName = adminFirstName;
        this.adminLastName = adminLastName;
    }

    public Admin(){}

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }
}
