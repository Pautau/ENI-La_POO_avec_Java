package fr.eni.tp;

import java.time.LocalDate;

abstract class Cycle {
    private String marque;
    private String modele;
    private LocalDate date;

    /**
     * @param marque
     * @param modele
     * @param date
     */
    public Cycle(String marque, String modele, LocalDate date) {
        this.marque = marque;
        this.modele = modele;
        this.date = date;
    }
    
    abstract double getPrixLocationHeure();

    // Permet de calculer la différence en année entre deux dates
    private String getAge(){
        int age = date.until(LocalDate.now()).getYears();
        if(age > 1){
            return age + " ans";
        } else {
            return age + " an";
        }
    }

    public String toString() {
        return "- " + getClass().getSimpleName() + " " + this.marque + " " + this.modele + " (" + getAge() + ")";
    }
}
