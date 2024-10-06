package com.example.Backend_Traini8.Repository;


import com.example.Backend_Traini8.Models.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepo extends JpaRepository<TrainingCenter, Long> {
}
