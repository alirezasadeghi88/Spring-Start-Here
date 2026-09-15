package com.learn.ch_10.model;

public class Country {

    private String name;
    private int population;

    public static Country of(
            String name,
            int population) {
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }
}
