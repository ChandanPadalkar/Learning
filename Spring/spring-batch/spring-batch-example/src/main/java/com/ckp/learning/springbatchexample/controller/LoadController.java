package com.ckp.learning.springbatchexample.controller;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoadController {

    private JobLauncher jobLauncher;
    private Job job;

    @Autowired
    public LoadController(JobLauncher jobLauncher, Job job) {
        this.jobLauncher = jobLauncher;
        this.job = job;
    }

    @GetMapping("/load")
    public BatchStatus load() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

        Map<String, JobParameter> jobParametersMap = new HashMap<>();
        jobParametersMap.put("time", new JobParameter(System.currentTimeMillis()));

        JobParameters parameters = new JobParameters(jobParametersMap);
        JobExecution jobExecution = jobLauncher.run(job, parameters);

        System.out.println("Job status : " + jobExecution.getStatus());

        return jobExecution.getStatus();
    }
}
