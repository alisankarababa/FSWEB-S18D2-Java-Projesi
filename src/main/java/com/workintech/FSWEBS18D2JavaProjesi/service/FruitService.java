package com.workintech.FSWEBS18D2JavaProjesi.service;

import com.workintech.FSWEBS18D2JavaProjesi.entity.Fruit;

import java.util.List;

public interface FruitService {

    List<Fruit> getAllAscendingPrice();
    Fruit getById(long id);
    List<Fruit> getAllDescendingPrice();
    Fruit save(Fruit fruit);

    List<Fruit> getAllContainintStringInTheName(String string);

    void delete(long id);

}
