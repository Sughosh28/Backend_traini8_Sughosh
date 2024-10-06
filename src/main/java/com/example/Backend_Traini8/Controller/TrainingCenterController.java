package com.example.Backend_Traini8.Controller;

import com.example.Backend_Traini8.Models.TrainingCenter;
import com.example.Backend_Traini8.Service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TrainingCenterController {

    @Autowired
    TrainingCenterService service;

    @PostMapping("/addTrainingCenters")
    public ResponseEntity<TrainingCenter> createTrainingCenters(@Valid @RequestBody TrainingCenter trainingCenter){

        TrainingCenter createTrainingCenter = service.createNewTrainingCenter(trainingCenter);
        return new ResponseEntity<>(createTrainingCenter, HttpStatus.OK);
    }

    @GetMapping("/getTrainingCenters")
    public ResponseEntity<List<TrainingCenter>> fetchTrainingCenters(){
        List<TrainingCenter> trainingCenter=service.fetchTrainingCenter();
        return new ResponseEntity<>(trainingCenter, HttpStatus.OK);

    }
}
