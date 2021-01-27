package com.example.suhiru.projectsunsolar.repo;


import com.example.suhiru.projectsunsolar.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer> {
}
//interface that communicates with the Project details table