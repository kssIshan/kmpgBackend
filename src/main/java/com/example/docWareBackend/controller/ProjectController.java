package com.example.docWareBackend.controller;


import com.example.docWareBackend.dto.ProjectDTO;
import com.example.docWareBackend.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/project")
@CrossOrigin


public class ProjectController {
    @Autowired
    private ProjectService projectService;


    @GetMapping("/getProject")
    public List<ProjectDTO> getProjectDTOS(){
        return projectService.getAllProjects();
    }

    @PostMapping("/saveProject")
    public ProjectDTO saveProject(@RequestBody ProjectDTO projectDTO){
        return projectService.saveProject(projectDTO);
    }

    @PutMapping("/updateProject")
    public  ProjectDTO updateProject(@RequestBody ProjectDTO projectDTO){
        return projectService.updateProject(projectDTO);
    }
}
