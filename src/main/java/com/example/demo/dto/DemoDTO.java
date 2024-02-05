package com.example.demo.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
@Valid
public class DemoDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("seq_no")
    private int seqNo;

    @NotBlank
    @JsonProperty("name")
    private String name;
}
