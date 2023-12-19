package com.workintech.FSWEBS18D2JavaProjesi.repository;

import com.workintech.FSWEBS18D2JavaProjesi.entity.Fruit;
import com.workintech.FSWEBS18D2JavaProjesi.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

    @Query(value = "SELECT s.id, s.name, s.price, s.fruit_type " +
            "FROM fsweb-s18d2.fruit as s" +
            "ORDER BY s.price", nativeQuery = true)
    List<Fruit> getAllAscendingPrice();
    @Query(value = "SELECT s.id, s.name, s.price, s.fruit_type " +
            "FROM fsweb-s18d2.fruit as s" +
            "ORDER BY s.price DESC", nativeQuery = true)
    List<Fruit> getAllDescendingPrice();

    @Query(value = "SELECT s.id, s.name, s.price, s.fruit_type " +
            "FROM fsweb-s18d2.fruit as s" +
            "WHERE s.name ILIKE %:string%", nativeQuery = true)
    List<Fruit> getAllContainintStringInTheName(String string);
}
