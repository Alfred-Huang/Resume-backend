package com.example.resume.pojo;

import java.util.List;

public class Sections {
    String sectionId;
    List<String> infoIdList;


    public Sections() {
    }

    public Sections(String sectionId, List<String> infoIdList) {
        this.sectionId = sectionId;
        this.infoIdList = infoIdList;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public List<String> getInfoIdList() {
        return infoIdList;
    }

    public void setInfoIdList(List<String> infoIdList) {
        this.infoIdList = infoIdList;
    }

    @Override
    public String toString() {
        return "Sections{" +
                "sectionId='" + sectionId + '\'' +
                ", infoIdList=" + infoIdList +
                '}';
    }
}
