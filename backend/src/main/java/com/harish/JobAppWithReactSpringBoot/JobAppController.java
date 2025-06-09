package com.harish.JobAppWithReactSpringBoot;

import com.harish.JobAppWithReactSpringBoot.model.JobPost;
import com.harish.JobAppWithReactSpringBoot.service.JobAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobAppController {
    @Autowired
    private JobAppService jobAppService;

    @GetMapping("jobs")
    private List<JobPost> getJobs(){
        return jobAppService.getJobs();
    }
    @GetMapping("jobs/{id}")
    private Optional<JobPost> getJob(@PathVariable("id") int jobId){
        return jobAppService.getJob(jobId);
    }
    @PostMapping("jobs")
    private JobPost addJob(@RequestBody JobPost job){
        return jobAppService.addJob(job);
    }
    @DeleteMapping("jobs/{id}")
    private String deleteJob(@PathVariable("id") int jobId){
        return jobAppService.deleteJob(jobId);
    }
    @PutMapping("/jobs")
    private JobPost editJob(@RequestBody JobPost jobPost){
        return jobAppService.editJob(jobPost);
    }

    @GetMapping("/")
    private void initalPush(){
        jobAppService.initalPush();
    }
}
