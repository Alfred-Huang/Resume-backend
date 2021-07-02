package com.example.resume.service.impl;

import com.example.resume.mapper.ResumeInfoMapper;
import com.example.resume.pojo.Experience;
import com.example.resume.pojo.Module;
import com.example.resume.pojo.ResumeInfo;
import com.example.resume.service.ResumeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeInfoImpl implements ResumeInfoService {
    @Autowired
    ResumeInfoMapper resumeInfoMapper;


    @Override
    public ResumeInfo getResumeInfo(String resumeId) {
        return resumeInfoMapper.getResumeInfo(resumeId);
    }
}
