package com.example.resume.mapper;

import com.example.resume.pojo.Experience;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ExperienceMapper {

    List<Experience> getExperiences(String moduleId);

    void addExperience(Experience experience);

    void addExperienceList(List<Experience> experiences);

    void updateExperience(Experience experience);

    void updateSectionTitle(String id, String title);
}
