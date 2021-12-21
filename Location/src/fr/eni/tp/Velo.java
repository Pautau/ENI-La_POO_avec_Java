package fr.eni.tp;

import java.time.LocalDate;

public class Velo extends Cycle{
    private int nbVitesse;
    private double prixLocationHeure = 4.90;

    /**
     * @param marque
     * @param modele
     * @param date
     * @param nbVitesse
     */
    public Velo(String marque, String modele, LocalDate date, int nbVitesse) {
        super(marque, modele, date);
        this.nbVitesse = nbVitesse;
    }

    @Override
    double getPrixLocationHeure() {
        return this.prixLocationHeure;
    }

    public String toString() {
        return super.toString() + " " + this.nbVitesse + " vitesses " + this.prixLocationHeure + "€/heure";
    }
}
