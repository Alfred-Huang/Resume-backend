package com.example.resume.service.impl;

import com.example.resume.mapper.ModuleMapper;
import com.example.resume.pojo.Module;
import com.example.resume.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    ModuleMapper moduleMapper;

    @Override
    public void addModuleList(List<Module> moduleList) {
         moduleMapper.addModuleList(moduleList);
    }

    @Override
    public void addModule(Module module) {
        moduleMapper.addModule(module);
    }

    @Override
    public void deleteModule(String moduleId) {
        moduleMapper.deleteModule(moduleId);
    }

    @Override
    public List<Module> getModule(String resumeId) {
        return moduleMapper.getModule(resumeId);
    }

    @Override
    public Integer updateModule(List<Module> moduleList) {
        return moduleMapper.updateModule(moduleList);
    }
}
