package com.example.resume.mapper;

import com.example.resume.pojo.Resume;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface ResumeMapper {

    Integer addResume(String resumeId, String userId, String resumeTitle);

    void deleteResume(String resumeId);

    List<Resume> getResume(String userId);
}
