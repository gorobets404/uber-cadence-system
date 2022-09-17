package services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Transactional
public class WorkerService {

    public void createCsvFile(String filePathName) {
        File csvFile = new File(filePathName);
        {
            try {
                FileWriter csvWriter = new FileWriter(csvFile);
                csvWriter.append("UserName (unique)");
                csvWriter.append(",");
                csvWriter.append("CompanyName");
                csvWriter.append(",");
                csvWriter.append("YearOfBirth");
                csvWriter.append("\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
