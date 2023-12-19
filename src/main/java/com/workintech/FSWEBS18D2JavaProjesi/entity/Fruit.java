package com.workintech.FSWEBS18D2JavaProjesi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="fruit", schema = "fsweb-s18d2")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank(message = "name cannot be empty")
    @Size(min = 3, max = 45, message = "name cannot contain less than 3, more than 45 characters")
    private String name;

    @NotNull
    @Positive(message = "price must be positive")
    private double price;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name="fruit_type")
    private FruitType fruitType;
}
