package com.example.docWareBackend.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Project {


    @Id

    private int id;
    private String projectName;
    private String projectDescription;
    private String clientName;
    private String division;
    private String projectManager;
}
