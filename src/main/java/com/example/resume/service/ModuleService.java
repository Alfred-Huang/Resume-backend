package com.example.resume.service;

import com.example.resume.pojo.Module;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ModuleService {

    void addModuleList(List<Module> moduleList);

    void addModule(Module module);

    void deleteModule(String moduleId);

    List<Module> getModule(String resumeId);

    Integer updateModule(List<Module> moduleList);

}
