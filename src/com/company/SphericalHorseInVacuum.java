package com.company;

public class SphericalHorseInVacuum extends SphericalHorse implements Breath {

    @Override
    public void run() {
        System.out.println(" Horse is running");

    }
    @Override
    public void breatheInVacuum() {
        System.out.println("I can breath");
    }

    @Override
    public String toString() {
        return "hello, a new horse";
    }
}