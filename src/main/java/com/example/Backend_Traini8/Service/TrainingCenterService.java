package com.example.Backend_Traini8.Service;


import com.example.Backend_Traini8.Models.TrainingCenter;
import com.example.Backend_Traini8.Repository.TrainingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.*;

@Service
public class TrainingCenterService {
    @Autowired
    TrainingRepo repo;

    public TrainingCenter createNewTrainingCenter(TrainingCenter trainingCenter) {
        trainingCenter.setCenterCode(generateCenterCode());

        trainingCenter.setCreatedOn(Instant.now().toEpochMilli());
        return repo.save(trainingCenter);
    }

    public List<TrainingCenter> fetchTrainingCenter() {
        return repo.findAll();
    }

    //  Method to generate a random 12-character alphanumeric string
    private String generateCenterCode() {
        int length = 12;
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }

        return sb.toString();
    }

    public List<TrainingCenter> findByFilters(String centerName, String city, String state) {
        return repo.findByFilters(centerName, city, state);
    }

    public List<TrainingCenter> findByCourse(String course) {
        return repo.findByCourse(course);
    }
}
