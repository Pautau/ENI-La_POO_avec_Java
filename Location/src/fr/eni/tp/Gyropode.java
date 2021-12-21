package fr.eni.tp;

import java.time.LocalDate;

public class Gyropode extends Gyro{
    private double tailleMin;
    private double prixLocationHeure = 29.90;

    /**
     * @param marque
     * @param modele
     * @param date
     * @param autonomie
     * @param tailleMin
     */
    public Gyropode(String marque, String modele, LocalDate date, int autonomie, double tailleMin) {
        super(marque, modele, date, autonomie);
        this.tailleMin = tailleMin;
    }

    @Override
    double getPrixLocationHeure() {
        return this.prixLocationHeure;
    }

    public String toString() {
        return super.toString() + "[" + this.tailleMin + "m minimum] " + this.prixLocationHeure + "€/heure";
    }
}
