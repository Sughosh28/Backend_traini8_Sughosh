package com.example.Backend_Traini8.Repository;


import com.example.Backend_Traini8.Models.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainingRepo extends JpaRepository<TrainingCenter, Long> {

    @Query("SELECT t from TrainingCenter t where"+
            "(:centerName IS NULL OR t.centerName LIKE %:centerName% ) AND"+
            "(:city IS NULL OR t.address.city LIKE %:city% ) AND"+
            "(:state IS NULL OR t.address.state LIKE %:state% )")
    List<TrainingCenter> findByFilters(String centerName, String city, String state);


    @Query("SELECT t FROM TrainingCenter t WHERE :course MEMBER OF t.coursesOffered")
    List<TrainingCenter> findByCourse(String course );
}


