package com.harish.JobAppWithReactSpringBoot.service;


import com.harish.JobAppWithReactSpringBoot.model.JobPost;
import com.harish.JobAppWithReactSpringBoot.repo.JobAppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAppService {
    @Autowired
    private JobAppRepo jobAppRepo;
    public List<JobPost> getJobs() {
        return jobAppRepo.getAll();
    }

    public JobPost addJob(JobPost jobPost) {
        jobAppRepo.save(jobPost);
        return jobPost;
    }

    public JobPost getJob(int jobId) {
        return jobAppRepo.getJob(jobId);
    }

    public String deleteJob(int jobId) {
        if(jobAppRepo.deleteJob(jobId)){
            return "Deleted";
        }
        return "Deletion Failed";
    }

    public JobPost editJob(JobPost jobPost) {
        return jobAppRepo.editJob(jobPost);
    }
}