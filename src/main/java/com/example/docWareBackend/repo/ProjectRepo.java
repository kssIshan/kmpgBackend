package com.example.docWareBackend.repo;

import com.example.docWareBackend.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, Integer> {
}
