package fr.eni.tp;

import java.time.LocalDate;

abstract class Gyro extends Cycle{
    private int autonomie;

    /**
     * @param marque
     * @param modele
     * @param date
     * @param autonomie
     */
    public Gyro(String marque, String modele, LocalDate date, int autonomie) {
        super(marque, modele, date);
        this.autonomie = autonomie;
    }
    
    public String toString() {
        return super.toString() + " " + this.autonomie + "km d'autonomie ";
    }
}
