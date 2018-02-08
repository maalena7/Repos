package com.company;

public class Main {

    public static void main(String[] args) {
        SphericalHorseInVacuum sh = new SphericalHorseInVacuum ();
        sh.run();
        sh.neigh();
        sh.breatheInVacuum();
        System.out.println(sh);
    }
}
