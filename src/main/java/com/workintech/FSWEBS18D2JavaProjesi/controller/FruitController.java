package com.workintech.FSWEBS18D2JavaProjesi.controller;

import com.workintech.FSWEBS18D2JavaProjesi.entity.Fruit;
import com.workintech.FSWEBS18D2JavaProjesi.service.FruitService;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/fruit")
public class FruitController {

    FruitService fruitService;

    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping
    public List<Fruit> getAllAscendingPrice() {
        return fruitService.getAllAscendingPrice();
    }
    @GetMapping("/{id}")
    public Fruit getById(@Positive @PathVariable long id) {
        return fruitService.getById(id);
    }

    @GetMapping("/desc")
    public List<Fruit> getAllDescendingPrice() {
        return fruitService.getAllDescendingPrice();
    }

    @PostMapping("/{name}")
    public List<Fruit> getAllContainingStringInTheName(@PathVariable String name) {
        return fruitService.getAllContainintStringInTheName(name);
    }

    @PostMapping
    public Fruit save(@RequestBody Fruit fruit) {
        return fruitService.save(fruit);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        fruitService.delete(id);
    }



}
