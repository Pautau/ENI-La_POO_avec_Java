package fr.eni.tp;

import java.time.LocalDate;

public class Location {
    public static void main(String[] args) {
        Cycle[] location = {
            new Velo("Lapierre", "speed 400", LocalDate.of(2019, 11, 21), 12),
            new Velo("Btwin", "riverside 900", LocalDate.of(2020, 10, 21), 12),
            new Gyropode("Segway", "Ninebot Elite", LocalDate.of(2021, 10, 20), 40, 1.50),
            new Gyropode("Weebot", "Echo", LocalDate.of(2020, 10, 20), 35, 1.60),
            new Gyroroue("Immotion", "v8", LocalDate.of(2020, 10, 20), 40),
            new Gyroroue("Segway", "Ninebot One E+", LocalDate.of(2020, 10, 20), 30),
        };

        for(Cycle i : location) {
            System.out.println(i);
        }
    }
}
