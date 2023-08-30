package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Village {

    @Id
    int villageId;
    String villageName;
    int numOfMen;
    int numOfWomen;
    int villagePopulation;
    int numOfSchools;


    public Village() {
    }


    public Village(int villageId, String villageName, int numOfMen, int numOfWomen, int villagePopulation,
            int numOfSchools) {
        this.villageId = villageId;
        this.villageName = villageName;
        this.numOfMen = numOfMen;
        this.numOfWomen = numOfWomen;
        this.villagePopulation = villagePopulation;
        this.numOfSchools = numOfSchools;
    }


    public int getVillageId() {
        return villageId;
    }


    public void setVillageId(int villageId) {
        this.villageId = villageId;
    }


    public String getVillageName() {
        return villageName;
    }


    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }


    public int getNumOfMen() {
        return numOfMen;
    }


    public void setNumOfMen(int numOfMen) {
        this.numOfMen = numOfMen;
    }


    public int getNumOfWomen() {
        return numOfWomen;
    }


    public void setNumOfWomen(int numOfWomen) {
        this.numOfWomen = numOfWomen;
    }


    public int getVillagePopulation() {
        return villagePopulation;
    }


    public void setVillagePopulation(int villagePopulation) {
        this.villagePopulation = villagePopulation;
    }


    public int getNumOfSchools() {
        return numOfSchools;
    }


    public void setNumOfSchools(int numOfSchools) {
        this.numOfSchools = numOfSchools;
    }

    

    

    
    
}
