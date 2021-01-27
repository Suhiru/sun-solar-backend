package com.example.suhiru.projectsunsolar.service;


import com.example.suhiru.projectsunsolar.model.Customer;
import com.example.suhiru.projectsunsolar.model.Project;
import com.example.suhiru.projectsunsolar.repo.CustomerRepository;
import com.example.suhiru.projectsunsolar.repo.ProjectRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProjectService {

    private ProjectRepository projectRepository;

    private CustomerRepository customerRepository;


    public ProjectService(ProjectRepository projectRepository, CustomerRepository customerRepository) {
        this.projectRepository = projectRepository;
        this.customerRepository = customerRepository;
    }

    //This method is not used,just for testing purpose
    public Project findProjectById(Integer projectCode){

        return projectRepository.findById(projectCode).orElseThrow(RuntimeException::new);
    }

    //save method
    public  String insertProject(Project project){

        //throw exception if the customer
       Customer customer =  customerRepository.findById(project.getCustomerId()).orElseThrow(RuntimeException::new);
       projectRepository.save(project);
        return "Saved Project";

        }

}
