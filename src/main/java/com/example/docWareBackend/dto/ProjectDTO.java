package com.example.docWareBackend.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProjectDTO {

    private int id;

    private String projectName;
    private String projectDescription;
    private String clientName;
    private String division;
    private String projectManager;

}
