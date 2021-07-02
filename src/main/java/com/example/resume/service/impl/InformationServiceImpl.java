package com.example.resume.service.impl;

import com.example.resume.mapper.InformationMapper;
import com.example.resume.pojo.Information;
import com.example.resume.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {
    final
    InformationMapper informationMapper;

    public InformationServiceImpl(InformationMapper informationMapper) {
        this.informationMapper = informationMapper;
    }

    @Override
    public void addInformationList(List<Information> informationList) {
        informationMapper.addInformationList(informationList);
    }

    @Override
    public void addInformation(Information information) {
        informationMapper.addInformation(information);
    }

    @Override
    public void updatePersonalInfo(Information information) {
        informationMapper.updatePersonalInfo(information);
    }

    @Override
    public void updateSummary(String newData, String infoId) {
        informationMapper.updateSummary(newData, infoId);
    }

    @Override
    public void updateGeneralInfo(Information information) {
        informationMapper.updateGeneralInfo(information);
    }

    @Override
    public void deleteInfo(String infoId) {
        informationMapper.deleteInfo(infoId);
    }
}
