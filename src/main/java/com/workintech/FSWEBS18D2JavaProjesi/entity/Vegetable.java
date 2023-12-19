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
@Table(name="vegetable", schema = "fsweb-s18d2")
public class Vegetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "name cannot be null")
    @NotBlank(message = "name cannot be empty")
    @Size(min = 3, max = 45, message = "name cannot be less than 3, more than 45 characters long")
    private String name;

    @NotNull
    @Positive(message = "price cannot be negative")
    private double price;

    @NotNull
    @Column(name="is_grown_on_tree")
    private boolean isGrownOnTree;
}
