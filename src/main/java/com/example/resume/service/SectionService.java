package com.example.resume.service;

import com.example.resume.pojo.Sections;
import sun.swing.SwingUtilities2;

import java.util.List;

public interface SectionService {

    void addSectionList(List<Sections> sections);

    void addSection(Sections sections);

    void addSignalSection(String sectionId, String infoId);

    void deleteSectionInfo(String infoId);
}
