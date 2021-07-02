package com.example.resume.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Module implements Serializable {

    private String id;
    private String resumeId;
    private String module;
    private Integer sortId;

    public Module() {
    }

    public Module(String id){
        this.id = id;
    }

    public Module(String id,  String module, Integer sortId) {
        this.id = id;
        this.module = module;
        this.sortId = sortId;
    }

    public Module(String id, String resumeId, String module, Integer sortId) {
        this.id = id;
        this.resumeId = resumeId;
        this.module = module;
        this.sortId = sortId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    @Override
    public String toString() {
        return "Module{" +
                "id='" + id + '\'' +
                ", resumeId='" + resumeId + '\'' +
                ", module='" + module + '\'' +
                ", sortId=" + sortId +
                '}';
    }
}
