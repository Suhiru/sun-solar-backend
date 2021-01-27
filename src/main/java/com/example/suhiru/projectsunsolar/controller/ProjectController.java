package com.example.suhiru.projectsunsolar.controller;


import com.example.suhiru.projectsunsolar.model.Project;
import com.example.suhiru.projectsunsolar.service.ProjectService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ProjectController {

    private ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/{projectCode}")
    private Project findProjectById(@PathVariable("projectCode") Integer projectCode ){

        return projectService.findProjectById(projectCode);
    }

    @PostMapping(value = "/insertProject")
    private String insertProject(@RequestBody Project project){

       return projectService.insertProject(project);
    }
}
