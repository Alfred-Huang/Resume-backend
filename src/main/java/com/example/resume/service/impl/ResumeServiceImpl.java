package com.example.resume.service.impl;

import com.example.resume.mapper.ResumeMapper;
import com.example.resume.pojo.Resume;
import com.example.resume.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    ResumeMapper resumeMapper;

    @Override
    public Integer addResume(String resumeId, String userId, String resumeTitle) {
        return resumeMapper.addResume(resumeId, userId, resumeTitle);
    }

    @Override
    public void deleteResume(String resumeId) {
         resumeMapper.deleteResume(resumeId);
    }

    @Override
    public List<Resume> getResume(String userId) {
        return  resumeMapper.getResume(userId);
    }
}
