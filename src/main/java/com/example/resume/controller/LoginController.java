package com.example.resume.controller;

import com.example.resume.pojo.Module;
import com.example.resume.pojo.Resume;
import com.example.resume.pojo.User;
import com.example.resume.service.impl.ModuleServiceImpl;
import com.example.resume.service.impl.ResumeServiceImpl;
import com.example.resume.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class LoginController {

    final
    UserServiceImpl userService;

    final
    ResumeServiceImpl resumeService;

    final
    ModuleServiceImpl moduleService;

    public LoginController(UserServiceImpl userService, ResumeServiceImpl resumeService, ModuleServiceImpl moduleService) {
        this.userService = userService;
        this.resumeService = resumeService;
        this.moduleService = moduleService;
    }

    @GetMapping("/")
    public String dd(){
        return "asdasdasdasd";
    }

    @PostMapping("/login")
    public void hello(@RequestBody Map<String, String> map){
        String username = map.get("username");
        String email = map.get("email");
        String userId = map.get("id");
        User user = new User(userId, username, email);
        List<String> queryResult = userService.getUser(userId);
        if(queryResult.size() == 0) {
            userService.addUser(user);
        }

    }

    @PostMapping("/main")
    public Map<String, Object> getResumeList(@RequestBody Map<String, String> map){
        String userId = map.get("userId");
        List<Resume> resumes;
        resumes = resumeService.getResume(userId);
        Map<String, Object> resumeMap = new HashMap<>();
        for(Resume data : resumes){
            String resumeId = data.getResumeId();
            resumeMap.put(resumeId, data);
        }
        return resumeMap;
    }


}
