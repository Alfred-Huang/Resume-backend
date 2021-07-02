package com.example.resume.service.impl;

import com.example.resume.mapper.ExperienceMapper;
import com.example.resume.pojo.Experience;
import com.example.resume.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    final
    ExperienceMapper experienceMapper;

    public ExperienceServiceImpl(ExperienceMapper experienceMapper) {
        this.experienceMapper = experienceMapper;
    }

    @Override
    public List<Experience> getExperiences(String moduleId) {
        return experienceMapper.getExperiences(moduleId);
    }

    @Override
    public void addExperience(Experience experience) {
        experienceMapper.addExperience(experience);
    }

    @Override
    public void addExperienceList(List<Experience> experiences) {
        experienceMapper.addExperienceList(experiences);
    }

    @Override
    public void updateExperience(Experience experience) {
        experienceMapper.updateExperience(experience);
    }

    @Override
    public void updateSectionTitle(String id, String title) {
        experienceMapper.updateSectionTitle(id, title);
    }
}
