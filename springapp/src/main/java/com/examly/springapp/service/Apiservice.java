package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Village;
import com.examly.springapp.repository.VillageRepo;

@Service
public class Apiservice {

    @Autowired
    public VillageRepo repo;

    public boolean add(Village village){
        return repo.save(village)!=null?true:false;
        
    }

    public Village getVillageId (int villageId) {
        return repo.findbyId(villageId);

    }

    public Village getVillagePop (int villagePopulation){
        return repo.findbypop(villagePopulation);
    }

    public Village getname (String villageName){
        return repo.findbyName(villageName);
    }

    public List<Village> getmenAndwomen( int numOfMen,int numOfWomen){
        return repo.findMW(numOfMen, numOfWomen);
    }

     
     
    
}
