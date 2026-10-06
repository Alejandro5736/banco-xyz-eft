package com.bancoxyz.msbatch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class BatchConfig {

    @Bean
    public Job procesoCierreDiarioJob(JobRepository jobRepository, Step pasoCierre) {
        return new JobBuilder("procesoCierreDiarioJob", jobRepository)
                .start(pasoCierre)
                .build();
    }

    @Bean
    public Step pasoCierre(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("pasoCierre", jobRepository)
                .tasklet((contribution, chunkContext) -> {
                    System.out.println(">>> Ejecutando procesamiento Batch: Cierre Diario de Transacciones Bancarias...");
                    return RepeatStatus.FINISHED;
                }, transactionManager)
                .build();
    }
}