package com.example.resume.service;

import com.example.resume.pojo.Information;

import java.util.List;

public interface InformationService {

    void addInformationList(List<Information> informationList);

    void addInformation(Information information);

    void updatePersonalInfo(Information information);

    void updateSummary(String newData, String infoId);

    void updateGeneralInfo(Information information);

    void deleteInfo(String infoId);
}
