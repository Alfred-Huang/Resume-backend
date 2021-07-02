package com.example.resume.pojo;

public class Resume {
    String resumeId;
    String userId;
    String resumeTitle;

    public Resume() {
    }

    public Resume(String resumeId, String userId, String resumeTitle) {
        this.resumeId = resumeId;
        this.userId = userId;
        this.resumeTitle = resumeTitle;
    }

    public Resume(String resumeId, String resumeTitle) {
        this.resumeId = resumeId;
        this.resumeTitle = resumeTitle;
    }

    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getResumeTitle() {
        return resumeTitle;
    }

    public void setResumeTitle(String resumeTitle) {
        this.resumeTitle = resumeTitle;
    }
}
