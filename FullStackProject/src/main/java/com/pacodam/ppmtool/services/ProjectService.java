package com.pacodam.ppmtool.services;

import com.pacodam.ppmtool.domain.Project;
import com.pacodam.ppmtool.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saverOrUpdate(Project project) {

        return projectRepository.save(project);
    }
}
