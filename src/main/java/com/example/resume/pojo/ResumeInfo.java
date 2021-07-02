package com.example.resume.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResumeInfo {
    private String resumeId;
    private List<Experience> experienceList;;
    private List<Sections> sections;
    private List<Information> informationList;



    public ResumeInfo() {
    }

    public ResumeInfo(String resumeId, List<Experience> experienceList, List<Sections> sections, List<Information> informationList) {
        this.resumeId = resumeId;
        this.experienceList = experienceList;
        this.sections = sections;
        this.informationList = informationList;
    }

    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    public List<Experience> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }

    public List<Sections> getSections() {
        return sections;
    }

    public void setSections(List<Sections> sections) {
        this.sections = sections;
    }

    public List<Information> getInformationList() {
        return informationList;
    }

    public void setInformationList(List<Information> informationList) {
        this.informationList = informationList;
    }

    @Override
    public String toString() {
        return "ResumeInfo{" +
                "resumeId='" + resumeId + '\'' +
                ", experienceList=" + experienceList +
                ", sections=" + sections +
                ", information=" + informationList +
                '}';
    }
}
