package com.example.resume.service.impl;

import com.example.resume.mapper.SectionMapper;
import com.example.resume.pojo.Sections;
import com.example.resume.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService {

    final
    SectionMapper sectionMapper;

    public SectionServiceImpl(SectionMapper sectionMapper) {
        this.sectionMapper = sectionMapper;
    }

    @Override
    public void addSectionList(List<Sections> sections) {
        sectionMapper.addSectionList(sections);
    }

    @Override
    public void addSection(Sections sections) {
        sectionMapper.addSection(sections);
    }

    @Override
    public void addSignalSection(String sectionId, String infoId) {
        sectionMapper.addSignalSection(sectionId, infoId);
    }

    @Override
    public void deleteSectionInfo(String infoId) {
        sectionMapper.deleteSectionInfo(infoId);
    }
}
