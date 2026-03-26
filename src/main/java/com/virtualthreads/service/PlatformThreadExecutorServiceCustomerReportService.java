package com.virtualthreads.service;

import com.virtualthreads.entity.Customer;
import com.virtualthreads.repository.CustomerRepository;
import com.virtualthreads.util.CsvReportUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



@Service
@Slf4j
public class PlatformThreadExecutorServiceCustomerReportService {
   static final Logger logger = LoggerFactory.getLogger(PlatformThreadExecutorServiceCustomerReportService.class);
    @Autowired
    private CustomerRepository customerRepository;



    public void generateCustomerReportByRegion(String region){


        String methodName = this.getClass().getName()+"."+ "generateCustomerReportByRegion()";
        logger.info("invoking  "+methodName);
        logger.info("generating report for region: {} | {}", region, Thread.currentThread());

        ExecutorService thread= Executors.newFixedThreadPool(5);
        thread.execute(()->{
            List<Customer> result= customerRepository.findByRegion(region);
//        logger.info(methodName+" result as outcome: "+result);
            try {
                CsvReportUtil.writeCustomersToCsv("PlatformThreadExecutorService_" + region, result);
            } catch (Exception e) {
                System.out.println(" PlatformThreadExecutorService Error writing report for region: " + region);
            }
        });


    }
}
