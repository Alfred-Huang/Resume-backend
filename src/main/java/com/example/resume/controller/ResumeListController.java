package com.example.resume.controller;


import com.example.resume.service.impl.ResumeServiceImpl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/main")
public class ResumeListController {

    @Autowired
    ResumeServiceImpl resumeService;


    @PostMapping("/addResume")
    public void addResume(@RequestBody Map<String, String> map){
        resumeService.addResume(map.get("resumeId"), map.get("userId"), map.get("resumeTitle"));
    }

    @PostMapping("/deleteResume")
    public void deleteResume(@RequestBody Map<String, String> map){
        resumeService.deleteResume(map.get("resumeId"));
    }


}
