package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tech", schema = "demo")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TechEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="seq_no")
    private int seqNo;

    @Column(name="name")
    private String name;

}
