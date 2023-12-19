package com.workintech.FSWEBS18D2JavaProjesi.repository;

import com.workintech.FSWEBS18D2JavaProjesi.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {

    @Query(value = "SELECT s.id, s.name, s.price, s.is_grown_on_tree " +
            "FROM fsweb-s18d2.vegetable as s" +
            "ORDER BY s.price", nativeQuery = true)
    List<Vegetable> getAllAscendingPrice();

    @Query(value = "SELECT s.id, s.name, s.price, s.is_grown_on_tree " +
            "FROM fsweb-s18d2.vegetable as s" +
            "ORDER BY s.price DESC", nativeQuery = true)
    List<Vegetable> getAllDescendingPrice();

    @Query(value = "SELECT s.id, s.name, s.price, s.is_grown_on_tree " +
            "FROM fsweb-s18d2.vegetable as s" +
            "WHERE s.name ILIKE %:string%", nativeQuery = true)
    List<Vegetable> getAllContainintStringInTheName(String string);
}
