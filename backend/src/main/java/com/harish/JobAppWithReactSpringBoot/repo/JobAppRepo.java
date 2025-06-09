package com.harish.JobAppWithReactSpringBoot.repo;


import com.harish.JobAppWithReactSpringBoot.model.JobPost;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface JobAppRepo extends JpaRepository<JobPost,Integer> {

    // constructor->injecting objects into ArrayList defined above.



}



/*
    public List<JobPost> getAll() {
        return jobs;
    }

    public JobPost save(JobPost jobPost) {
        JobPost newJob = new JobPost();
        newJob.setPostDesc(jobPost.getPostDesc());
        newJob.setPostId(jobPost.getPostId());
        newJob.setPostProfile(jobPost.getPostProfile());
        newJob.setReqExperience(jobPost.getReqExperience());
        newJob.setPostTechStack(jobPost.getPostTechStack());
        jobs.add(newJob);
        return getJob(newJob.getPostId());
    }

    public JobPost getJob(int jobId) {
        for(JobPost job:jobs){
            if(job.getPostId() == jobId){
                return job;
            }
        }
        return null;
    }

    public boolean deleteJob(int jobId) {
        for(JobPost job:jobs){
            if(job.getPostId() == jobId){
                jobs.remove(job);
                return true;
            }
        }
        return false;
    }

    public JobPost editJob(JobPost jobPost) {
        for(JobPost job:jobs){
            if(job.getPostId() == jobPost.getPostId()){
                jobs.remove(job);
                jobs.add(jobPost);
            }
        }
        return getJob(jobPost.getPostId());
    }*/
