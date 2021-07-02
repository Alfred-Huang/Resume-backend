package com.example.resume.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Information {
    private String infoId;
    private String project;
    private String role;
    private String location;
    private String startDate;
    private String endDate;

    @JsonProperty
    private String HTMLContent;

    private String name;
    private String telephone;
    private String email;
    private String personalLocation;
    private String other;

    public Information() {
    }


    public Information(String infoId, String project, String role, String location, String startDate, String endDate, String HTMLContent, String name, String telephone, String email, String personalLocation, String other) {
        this.infoId = infoId;
        this.project = project;
        this.role = role;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.HTMLContent = HTMLContent;
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.personalLocation = personalLocation;
        this.other = other;
    }

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonIgnore
    public String getHTMLContent() {
        return HTMLContent;
    }
    @JsonIgnore
    public void setHTMLContent(String HTMLContent) {
        this.HTMLContent = HTMLContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonalLocation() {
        return personalLocation;
    }

    public void setPersonalLocation(String personalLocation) {
        this.personalLocation = personalLocation;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Information{" +
                "infoId='" + infoId + '\'' +
                ", project='" + project + '\'' +
                ", role='" + role + '\'' +
                ", location='" + location + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", HTMLContent='" + HTMLContent + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", personalLocation='" + personalLocation + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
