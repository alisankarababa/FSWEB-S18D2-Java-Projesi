package com.workintech.FSWEBS18D2JavaProjesi.service;

import com.workintech.FSWEBS18D2JavaProjesi.entity.Fruit;
import com.workintech.FSWEBS18D2JavaProjesi.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService{

    FruitRepository fruitRepository;

    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public List<Fruit> getAllAscendingPrice() {
        return fruitRepository.getAllAscendingPrice();
    }

    @Override
    public Fruit getById(long id) {
        return fruitRepository.getById(id);
    }

    @Override
    public List<Fruit> getAllDescendingPrice() {
        return fruitRepository.getAllDescendingPrice();
    }

    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public List<Fruit> getAllContainintStringInTheName(String string) {
        return fruitRepository.getAllContainintStringInTheName(string);
    }

    @Override
    public void delete(long id) {
        fruitRepository.deleteById(id);
    }
}
