package com.example.resume.pojo;

public class BasicInfo {
    private String name;
    private String telephone;
    private String email;
    private String personalLocation;
    private String other;

    public BasicInfo() {
    }

    public BasicInfo(String name, String telephone, String email, String personalLocation, String other) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.personalLocation = personalLocation;
        this.other = other;
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
        return "BasicInfo{" +
                "name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", personalLocation='" + personalLocation + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
