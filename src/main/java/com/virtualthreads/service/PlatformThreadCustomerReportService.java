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

import static java.lang.Thread.ofPlatform;


@Service
@Slf4j
public class PlatformThreadCustomerReportService {
   static final Logger logger = LoggerFactory.getLogger(PlatformThreadCustomerReportService.class);
    @Autowired
    private CustomerRepository customerRepository;


    public void generateCustomerReportByRegion(String region){


        String methodName = this.getClass().getName()+"."+ "generateCustomerReportByRegion()";
        logger.info("invoking  "+methodName);
        logger.info("generating report for region: {} | {}", region, Thread.currentThread());

        Thread.Builder builder= ofPlatform().name("PlatformThread-",0);
        builder.start(()->{
            List<Customer> result= customerRepository.findByRegion(region);
//        logger.info(methodName+" result as outcome: "+result);
            try {
                CsvReportUtil.writeCustomersToCsv("PlatformThread_" + region, result);
            } catch (Exception e) {
                System.out.println(" PlatformThread Error writing report for region: " + region);
            }
        });


    }
}
