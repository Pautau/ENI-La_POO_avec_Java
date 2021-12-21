package fr.eni.tp;

import java.time.LocalDate;

public class Gyroroue extends Gyro {
    private double prixLocationHeure = 18.90;

    /**
     * @param marque
     * @param modele
     * @param date
     * @param autonomie
     */
    public Gyroroue(String marque, String modele, LocalDate date, int autonomie) {
        super(marque, modele, date, autonomie);
    }

    @Override
    double getPrixLocationHeure() {
        return this.prixLocationHeure;
    }

    public String toString() {
        return super.toString() + this.prixLocationHeure + "€/heure";
    }
}
