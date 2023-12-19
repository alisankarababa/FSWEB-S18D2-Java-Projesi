package com.workintech.FSWEBS18D2JavaProjesi.controller;

import com.workintech.FSWEBS18D2JavaProjesi.entity.Fruit;
import com.workintech.FSWEBS18D2JavaProjesi.entity.Vegetable;
import com.workintech.FSWEBS18D2JavaProjesi.service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vegetable")
public class VegetableController {

    VegetableService vegetableService;

    @Autowired
    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }

    @GetMapping
    public List<Vegetable> getAllAscendingPrice() {
        return vegetableService.getAllAscendingPrice();
    }
    @GetMapping("/{id}")
    public Vegetable getById(@PathVariable long id) {
        return vegetableService.getById(id);
    }

    @GetMapping("/desc")
    public List<Vegetable> getAllDescendingPrice() {
        return vegetableService.getAllDescendingPrice();
    }

    @PostMapping
    public Vegetable save(@RequestBody Vegetable vegetable) {
        return vegetableService.save(vegetable);
    }

    @PostMapping("/{name}")
    public List<Vegetable> getAllContainingStringInTheName(@PathVariable String name) {
        return vegetableService.getAllContainintStringInTheName(name);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        vegetableService.delete(id);
    }

}
