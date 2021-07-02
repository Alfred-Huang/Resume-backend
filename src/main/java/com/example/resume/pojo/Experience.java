package com.example.resume.pojo;

public class Experience {
    String id;
    String module;
    String title;
    String sectionId;
    String resumeId;

    public Experience(){}

    public Experience(String id, String module, String title, String sectionId, String resumeId) {
        this.id = id;
        this.module = module;
        this.title = title;
        this.sectionId = sectionId;
        this.resumeId = resumeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id='" + id + '\'' +
                ", module='" + module + '\'' +
                ", title='" + title + '\'' +
                ", sectionId='" + sectionId + '\'' +
                ", resumeId='" + resumeId + '\'' +
                '}';
    }
}
