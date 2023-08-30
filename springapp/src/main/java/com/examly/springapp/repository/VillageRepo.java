package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Village;

@Repository
public interface VillageRepo extends JpaRepository<Village , Integer>{

    @Query(value = "SELECT * FROM  village u  WHERE u.village_Id = ?1", nativeQuery = true)
    public Village findbyId(int villageId);

    @Query(value = "SELECT * FROM  village u WHERE u.village_Name = ?1", nativeQuery = true)
    public Village findbyName (String villageName);

    @Query(value = "SELECT * FROM  village u WHERE u.village_Population = ?1", nativeQuery = true)
    public Village findbypop (int villagePopulation);

    @Query(value = "SELECT * FROM  village u WHERE u.num_of_men = ?1 AND u.num_of_women = ?2", nativeQuery = true)
    public List<Village> findMW(int numOfMen, int numOfWomen);



}
