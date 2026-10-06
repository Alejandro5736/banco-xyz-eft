package com.bancoxyz.msbatch.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/batch")
public class BatchJobController {

    private final JobLauncher jobLauncher;
    private final Job procesoCierreDiarioJob;

    public BatchJobController(JobLauncher jobLauncher, Job procesoCierreDiarioJob) {
        this.jobLauncher = jobLauncher;
        this.procesoCierreDiarioJob = procesoCierreDiarioJob;
    }

    @PostMapping("/ejecutar-cierre")
    public ResponseEntity<String> ejecutarCierreDiario() {
        try {
            JobParameters jobParameters = new JobParametersBuilder()
                    .addLong("time", System.currentTimeMillis())
                    .toJobParameters();
            jobLauncher.run(procesoCierreDiarioJob, jobParameters);
            return ResponseEntity.ok("Proceso batch de cierre diario iniciado exitosamente.");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Error al ejecutar el trabajo batch: " + e.getMessage());
        }
    }
}