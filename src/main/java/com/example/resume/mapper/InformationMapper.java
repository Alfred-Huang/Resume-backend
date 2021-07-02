package com.example.resume.mapper;

import com.example.resume.pojo.Information;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InformationMapper {

    void addInformationList(List<Information> informationList);

    void addInformation(Information information);

    void updatePersonalInfo(Information information);

    void updateSummary(String newData, String infoId);

    void updateGeneralInfo(Information information);

    void deleteInfo(String info_Id);
}
