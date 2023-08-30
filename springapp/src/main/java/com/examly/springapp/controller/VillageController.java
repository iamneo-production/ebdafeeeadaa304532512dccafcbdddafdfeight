package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Village;
import com.examly.springapp.service.Apiservice;

@RestController
public class VillageController {

    @Autowired
    public Apiservice api;

    @PostMapping("/")
    public boolean addVillageDetails(@RequestBody Village village){
        return api.add(village);
    }

    @GetMapping("/village/{villageId}")
    public Village getId(@PathVariable int villageId){
        return api.getVillageId(villageId);
    }

    @GetMapping("/population/{villagePopulation}")
    public Village getpop(@PathVariable int villagePopulation) {
        return api.getVillagePop(villagePopulation);
    }

    @GetMapping("/name/{villageName}")
    public Village getname(@PathVariable String villageName){
        return api.getname(villageName);
    }

    @GetMapping("/{numOfMen}/{numOfWomen}")
    public List<Village> getid(@PathVariable int numOfMen, @PathVariable int numOfWomen){
        return api.getmenAndwomen(numOfMen,numOfWomen);
    }

    
    
    
}
