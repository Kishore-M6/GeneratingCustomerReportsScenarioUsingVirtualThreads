package com.virtualthreads.util;

import com.virtualthreads.entity.Customer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Component
public class CsvReportUtil {
    public static void writeCustomersToCsv(String region, List<Customer> customers) throws IOException {
        Path path = Paths.get("C:/toolspractice/interviewspecific/VirtualThreads/reports", region + "_report.csv");
        Files.createDirectories(path.getParent());

        try (BufferedWriter writer = Files.newBufferedWriter(path);
             CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                     .withHeader("CustomerId", "CustomerName", "Email","Gender", "Region"))) {

            for (Customer customer : customers) {
                csvPrinter.printRecord(customer.getCustomerId(), customer.getCustomerName(), customer.getEmail(),customer.getGender(), customer.getRegion());
            }
        }
    }

}
