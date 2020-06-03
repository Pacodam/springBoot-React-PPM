package com.pacodam.ppmtool.web;

import com.pacodam.ppmtool.domain.Project;
import com.pacodam.ppmtool.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("")
    public ResponseEntity<?> createNewProject (@Valid @RequestBody Project project, BindingResult result){

        if(result.hasErrors()){
            return new ResponseEntity<String>("Invalid Project object", HttpStatus.BAD_REQUEST);
        }
        Project project1 = projectService.saverOrUpdate(project);
        return new ResponseEntity<Project>(project, HttpStatus.CREATED);
    }

}
