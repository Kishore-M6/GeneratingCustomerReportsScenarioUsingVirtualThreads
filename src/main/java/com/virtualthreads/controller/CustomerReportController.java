package com.virtualthreads.controller;

import com.virtualthreads.service.*;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@RequestMapping(value = "/customerReports")
@RequiredArgsConstructor
@OpenAPIDefinition(info = @Info(title ="VirtualThreads", description = "VirtualThreads, provides logic for handling platform threads and virtual threads",
        contact = @Contact(name = "Manubolu_Kishore", url = "https://chatgpt.com/?oai-dm=1", email = "manubolukishore6@gmail.com"), version = "1.0.0"),
        servers = {@Server(description = "developers", url = "http://localhost:9099/")})
public class CustomerReportController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerReportController.class);

    private final CustomerReportService customerReportService;

    private final PlatformThreadCustomerReportService platformThreadCustomerReportService;

    private final PlatformThreadExecutorServiceCustomerReportService platformThreadExecutorServiceCustomerReportService;

    private final VirtualThreadCustomerReportService virtualThreadCustomerReportService;

    private final VirtualThreadPerTaskExecutorCustomerReportService virtualThreadPerTaskExecutorCustomerReportService;


    @GetMapping(value = "/{region}",produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(method = "generateCustomerReports",description = "api for generating customer reports by passing region ")
    public ResponseEntity<String> generateCustomerReports(@PathVariable(value = "region") String region){
        String methodName = this.getClass().getName()+".generateCustomerReports()";
        logger.info("invoking  "+methodName+ "with region: "+region );
        customerReportService.generateCustomerReportByRegion(region);
        return ResponseEntity.ok("  report started for region: " + region);
    }

    @GetMapping(value = "/platform/{region}",produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(method = "generateCustomerReportsUsingPlatformThread",description = "api for generating customer reports by passing region using platform threads ")
    public ResponseEntity<String> generateCustomerReportsUsingPlatformThread(@PathVariable(value = "region") String region){
        String methodName = this.getClass().getName()+".generateCustomerReportsUsingPlatformThread()";
        logger.info("invoking  "+methodName+ "with region: "+region );
        platformThreadCustomerReportService.generateCustomerReportByRegion(region);
        return ResponseEntity.ok("  report started for region: " + region);
    }

    @GetMapping(value = "/platform/executor_service/{region}",produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(method = "generateCustomerReportsUsingPlatformThreadExecutorService",description = "api for generating customer reports by passing region using platform threads and ExecutorService ")
    public ResponseEntity<String> generateCustomerReportsUsingPlatformThreadExecutorService(@PathVariable(value = "region") String region){
        String methodName = this.getClass().getName()+".generateCustomerReportsUsingPlatformThreadExecutorService()";
        logger.info("invoking  "+methodName+ "with region: "+region );
        platformThreadExecutorServiceCustomerReportService.generateCustomerReportByRegion(region);
        return ResponseEntity.ok("  report started for region: " + region);
    }

    @GetMapping(value = "/virtualthreads/{region}",produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(method = "generateCustomerReportsUsingVirtualThread",description = "api for generating customer reports by passing region using virtual threads ")
    public ResponseEntity<String> generateCustomerReportsUsingVirtualThread(@PathVariable(value = "region") String region){
        String methodName = this.getClass().getName()+".generateCustomerReportsUsingVirtualThread()";
        logger.info("invoking  "+methodName+ "with region: "+region );
        virtualThreadCustomerReportService.generateCustomerReportByRegion(region);
        return ResponseEntity.ok("  report started for region: " + region);
    }
    @GetMapping(value = "/virtualthreadspertaskexecutor/{region}",produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(method = "generateCustomerReportsUsingVirtualThreadPerTaskExecutor",description = "api for generating customer reports by passing region using VirtualThreadsPerTaskExecutor")
    public ResponseEntity<String> generateCustomerReportsUsingVirtualThreadPerTaskExecutor(@PathVariable(value = "region") String region){
        String methodName = this.getClass().getName()+".generateCustomerReportsUsingVirtualThreadPerTaskExecutor()";
        logger.info("invoking  "+methodName+ "with region: "+region );
        virtualThreadPerTaskExecutorCustomerReportService.generateCustomerReportByRegion(region);
        return ResponseEntity.ok("  report started for region: " + region);
    }
}
