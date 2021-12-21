package fr.eni.tp.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class RendezVous {
    private Creneau creneau;
    private Patient patient;
    private LocalDate date;
    
    public RendezVous(Creneau creneau, Patient patient, LocalDate date) {
        this.creneau = creneau;
        this.patient = patient;
        this.date = date;
    }

    public void afficher(){
        System.out.printf("Rendez-vous du %s ",
        this.date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        this.creneau.afficher();
        System.out.printf("Avec le Docteur %s%npour ",
        this.creneau.getMedecin().getNom());
        this.patient.afficher();
    }
}
