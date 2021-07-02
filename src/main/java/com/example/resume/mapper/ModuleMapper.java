package com.example.resume.mapper;

import com.example.resume.pojo.Module;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ModuleMapper {

    void addModuleList(List<Module> moduleList);

    void addModule(Module module);

    void deleteModule(String moduleId);

    List<Module> getModule(String resumeId);

    Integer updateModule(List<Module> moduleList);
}
