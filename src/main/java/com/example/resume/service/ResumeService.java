package com.example.resume.service;

import com.example.resume.pojo.Experience;
import com.example.resume.pojo.Resume;

import java.util.List;

public interface ResumeService {

    Integer addResume(String resumeId, String userId, String resumeTitle);

    void deleteResume(String resumeId);

    List<Resume> getResume(String userId);


}
