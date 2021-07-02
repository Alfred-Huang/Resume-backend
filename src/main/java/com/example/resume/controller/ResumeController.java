package com.example.resume.controller;


import com.example.resume.pojo.*;
import com.example.resume.service.impl.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.sampled.Line;
import java.util.*;

@RestController
@RequestMapping("/resume")
public class ResumeController {


    final
    ObjectMapper objectMapper;

    final
    ModuleServiceImpl moduleService;

    final
    ResumeInfoImpl resumeInfo;

    final
    ExperienceServiceImpl experienceService;

    final
    SectionServiceImpl sectionService;

    final
    InformationServiceImpl informationService;

    public ResumeController(ModuleServiceImpl moduleService, ResumeInfoImpl resumeInfo,
                            ExperienceServiceImpl experienceService, SectionServiceImpl sectionService, InformationServiceImpl informationService, ObjectMapper objectMapper) {
        this.experienceService = experienceService;
        this.moduleService = moduleService;
        this.resumeInfo = resumeInfo;
        this.sectionService = sectionService;
        this.informationService = informationService;
        this.objectMapper = objectMapper;
    }


    @PostMapping("/getModule")
    public  Map<String, Map<String, Object>> getModule(@RequestBody Map<String, String> map){
        Map<String, Map<String, Object>> result = new HashMap<>();
        Map<String, Object> exp = new HashMap<>();
        Map<String, Object> sec = new HashMap<>();
        Map<String, Object> info = new HashMap<>();
        Map<String, Object> module = new HashMap<>();
        List<Module> moduleList =  moduleService.getModule(map.get("resumeId"));
        if(moduleList.size() == 0){
            //initial resume information
             String moduleId = UUID.randomUUID().toString();
             String moduleId2 = UUID.randomUUID().toString();
             String sectionId =  UUID.randomUUID().toString();
             String sectionId2 = UUID.randomUUID().toString();
             String infoId = UUID.randomUUID().toString();
             String infoId2 = UUID.randomUUID().toString();

             Module module1 = new Module(moduleId, map.get("resumeId"),"basicInfo", 1);
             Module module2 = new Module(moduleId2, map.get("resumeId"),"education", 2);
             List<Module> moduleListForInsert = new ArrayList<>(Arrays.asList(module1,module2));
             moduleService.addModuleList(moduleListForInsert);

             Experience experience = new Experience(moduleId, "basicInfo", "basic info", sectionId, map.get("resumeId"));
             Experience experience2 = new Experience(moduleId2, "education", "education", sectionId2, map.get("resumeId"));
             List<Experience> experiencesListForInsert = new ArrayList<>(Arrays.asList(experience, experience2));
             experienceService.addExperienceList(experiencesListForInsert);
             exp.put(experience.getId(), experience);
             exp.put(experience2.getId(), experience2);

             Sections sections = new Sections(sectionId, new ArrayList<>(Collections.singletonList(infoId)));
             Sections sections2 = new Sections(sectionId2, new ArrayList<>(Collections.singletonList(infoId2)));
             List<Sections> sectionsList = new ArrayList<>(Arrays.asList(sections, sections2));
             sectionService.addSectionList(sectionsList);
             sec.put(sections.getSectionId(), sections);
             sec.put(sections2.getSectionId(), sections2);

             Information information = new Information(infoId, "", "", "", "","", "", "NAME","(xxx)xxx-xxxx","xxx@gmail.com","New York", "");
             Information information2 = new Information(infoId2, "", "", "", "","", "", "","","","", "");
             List<Information> informationList = new ArrayList<>(Arrays.asList(information, information2));
             informationService.addInformationList(informationList);
             info.put(information.getInfoId(), information);
             info.put(information2.getInfoId(), information2);


            module.put("modules", moduleListForInsert);
            result.put("experience", exp);
            result.put("sections", sec);
            result.put("information", info);
            result.put("module", module);
            return result;
        }else {

            moduleList.sort(Comparator.comparing(Module::getSortId));
            ResumeInfo resumeInfoObj =  resumeInfo.getResumeInfo(map.get("resumeId"));
            List<Experience> experiencesList = resumeInfoObj.getExperienceList();
            List<Sections> sectionsList = resumeInfoObj.getSections();
            List<Information> informationList = resumeInfoObj.getInformationList();

            for(Experience e : experiencesList){
                exp.put(e.getId(),e);
            }
            for(Sections s : sectionsList){
                sec.put(s.getSectionId(), s);
            }
            for(Information i : informationList){
                info.put(i.getInfoId(), i);
            }

            module.put("modules", moduleList);
            result.put("experience", exp);
            result.put("sections", sec);
            result.put("information", info);
            result.put("module", module);
        }
        return result;
    }


    @PostMapping("/updateModuleSortId")
    public void updateSortId(@RequestBody String moduleList) throws JsonProcessingException {
        List<Module> result = objectMapper.readValue(moduleList, new TypeReference<List<Module>>(){});
        moduleService.updateModule(result);
    }

    @PostMapping("/addModule")
    public void addModule(@RequestBody Map<String, Map<String, Object>> target) throws JsonProcessingException {
        Object newExperience = target.get("newData").get("newExperience");
        Object newSection = target.get("newData").get("newSection");
        Object newInformation = target.get("newData").get("newInformation");
        experienceService.addExperience(objectMapper.convertValue(newExperience, Experience.class));
        sectionService.addSection(objectMapper.convertValue(newSection, Sections.class));
        informationService.addInformation(objectMapper.convertValue(newInformation, Information.class));
        Object newModule = target.get("newModule");
        moduleService.addModule(objectMapper.convertValue(newModule, Module.class));
    }

    @PostMapping("/deleteModule")
    public void deleteModule(@RequestBody String target) throws JsonProcessingException {
        Module m = objectMapper.readValue(target, Module.class);
        moduleService.deleteModule(m.getId());
    }


    @PostMapping("/updateSectionTitle")
    public void updateSectionTitle(@RequestBody Map<String, String> map){
        experienceService.updateSectionTitle(map.get("experienceId"), map.get("title"));
    }

    @PostMapping("/updatePersonalInfo")
    public void updatePersonalInfo(@RequestBody String data) throws JsonProcessingException {
        Information information = objectMapper.readValue(data, Information.class);
        informationService.updatePersonalInfo(information);
    }

    @PostMapping("/updateSummary")
    public void updateSummary(@RequestBody Map<String, String> map){
        informationService.updateSummary((map.get("HTMLContent")), map.get("infoId"));

    }


    @PostMapping("/updateGeneralInfo")
    public void updateGeneralInfo(@RequestBody String data) throws JsonProcessingException {
        Information information = objectMapper.readValue(data, Information.class);
        informationService.updateGeneralInfo(information);

    }

    @PostMapping("/deleteInfo")
    public void deleteInfo(@RequestBody Map<String, String> map){
        informationService.deleteInfo(map.get("infoId"));
        sectionService.deleteSectionInfo(map.get("infoId"));
    }

    @PostMapping("addSectionInfo")
    public void addSectionInfo(@RequestBody Map<String, Object> map) throws JsonProcessingException {
        Information information = objectMapper.convertValue(map.get("information"), Information.class);
        informationService.addInformation(information);
        sectionService.addSignalSection((String)map.get("sectionId"), (String)map.get("id"));
    }
    
}
