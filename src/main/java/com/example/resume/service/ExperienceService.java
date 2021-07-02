package com.example.resume.service;

import com.example.resume.pojo.Experience;

import java.util.List;

public interface ExperienceService {

    List<Experience> getExperiences(String moduleId);

    void addExperience(Experience experience);

    void addExperienceList(List<Experience> experiences);

    void updateExperience(Experience experience);

    void updateSectionTitle(String id, String title);

}
