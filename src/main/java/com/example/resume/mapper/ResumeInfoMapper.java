package com.example.resume.mapper;

import com.example.resume.pojo.Experience;
import com.example.resume.pojo.Module;
import com.example.resume.pojo.ResumeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ResumeInfoMapper {

    ResumeInfo getResumeInfo(String resumeId);
}
