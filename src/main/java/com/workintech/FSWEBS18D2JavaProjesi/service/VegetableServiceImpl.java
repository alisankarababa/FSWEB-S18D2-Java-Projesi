package com.workintech.FSWEBS18D2JavaProjesi.service;

import com.workintech.FSWEBS18D2JavaProjesi.entity.Vegetable;
import com.workintech.FSWEBS18D2JavaProjesi.repository.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Retention;
import java.util.List;

@Service
public class VegetableServiceImpl implements VegetableService{

    VegetableRepository vegetableRepository;

    @Autowired
    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    @Override
    public List<Vegetable> getAllAscendingPrice() {
        return vegetableRepository.getAllAscendingPrice();
    }

    @Override
    public Vegetable getById(long id) {
        return vegetableRepository.getById(id);
    }

    @Override
    public List<Vegetable> getAllDescendingPrice() {
        return vegetableRepository.getAllDescendingPrice();
    }

    @Override
    public Vegetable save(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    @Override
    public List<Vegetable> getAllContainintStringInTheName(String string) {
        return vegetableRepository.getAllContainintStringInTheName(string);
    }

    @Override
    public void delete(long id) {
        vegetableRepository.deleteById(id);
    }
}
