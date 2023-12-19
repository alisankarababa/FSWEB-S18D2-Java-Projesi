package com.workintech.FSWEBS18D2JavaProjesi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
@Entity
@Table(name="fruit", schema = "fsweb-s18d2")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;

    @Enumerated(EnumType.STRING)
    @Column(name="fruit_type")
    private FruitType fruitType;
}
