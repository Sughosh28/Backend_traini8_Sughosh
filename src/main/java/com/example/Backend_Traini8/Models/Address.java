package com.example.Backend_Traini8.Models;

import lombok.Data;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.*;

@Data
@Embeddable
public class Address {

    @NotBlank(message = "Detailed address needed.")
    private String detailedAddress;

    @NotBlank(message = "City is required.")
    private String city;

    @NotBlank(message = "State is required.")
    private String state;

    @Pattern(regexp = "^\\d{6}$", message = "Pin-code must be exactly 6 digits.")
    @Size(min = 6,message = "Pin-code must be exactly 6 digits.")
    private String pincode;
}
