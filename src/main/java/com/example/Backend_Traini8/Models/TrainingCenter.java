package com.example.Backend_Traini8.Models;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 40)
    @Size(max = 40,message = "Training center name must be at most 40 characters")
    @NotBlank(message = "Training center name cannot be blank or empty")
    private String centerName;


    @Column(nullable = false,unique = true, length = 12)
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Training center code must be 12 alphanumeric characters.")
    private String centerCode;

    @Valid
    @Embedded
    private Address address;

    @Min(value = 0, message="Students capacity must be positive")
    private int studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    @Column(nullable = false)
    private Long createdOn;

    @Email(message = "Invalid email format.")
    private String contactEmail;

    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be exactly 10 digits.")
    @NotBlank(message = "Contact phone is mandatory.")
    private String contactPhone;

}
