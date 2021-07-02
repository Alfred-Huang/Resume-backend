package com.example.resume.mapper;

import com.example.resume.pojo.Sections;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface SectionMapper {

    void addSectionList(List<Sections> sections);

    void addSection(Sections sections);

    void deleteSectionInfo(String infoId);

    void addSignalSection(String sectionId, String infoId);
}
