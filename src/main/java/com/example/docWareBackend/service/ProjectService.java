package com.example.docWareBackend.service;


import com.example.docWareBackend.dto.ProjectDTO;
import com.example.docWareBackend.entity.Project;
import com.example.docWareBackend.repo.ProjectRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProjectService {

    @Autowired
    private ProjectRepo projectRepo;

    @Autowired
    private ModelMapper modelMapper;

    public ProjectDTO saveProject(ProjectDTO projectDTO){
        projectRepo.save(modelMapper.map(projectDTO, Project.class));
        return projectDTO;
    }

    public List<ProjectDTO>getAllProjects(){
        List<Project>projectList= projectRepo.findAll();
        return modelMapper.map(projectList, new TypeToken<List<ProjectDTO>>(){}.getType());
    }


    public ProjectDTO updateProject(ProjectDTO projectDTO){
        projectRepo.save(modelMapper.map(projectDTO, Project.class));
        return projectDTO;
    }



}
