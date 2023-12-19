package com.workintech.FSWEBS18D2JavaProjesi.service;

import com.workintech.FSWEBS18D2JavaProjesi.entity.Fruit;
import com.workintech.FSWEBS18D2JavaProjesi.entity.Vegetable;

import java.util.List;

public interface VegetableService {

    List<Vegetable> getAllAscendingPrice();
    Vegetable getById(long id);
    List<Vegetable> getAllDescendingPrice();
    Vegetable save(Vegetable vegetable);
    List<Vegetable> getAllContainintStringInTheName(String string);

    void delete(long id);
}
