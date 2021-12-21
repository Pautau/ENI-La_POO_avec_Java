package fr.eni.tp.bo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Creneau {
    private LocalTime heureDebut;
    private int duree;
    private MedecinGeneraliste medecin;
    
    public Creneau(LocalTime heureDebut, int duree, MedecinGeneraliste medecin) {
        this.heureDebut = heureDebut;
        this.duree = duree;
        this.medecin = medecin;
        medecin.ajouterCreneau(this);
    }

    public void afficher() {
        System.out.printf("%s - %s (%d minutes)%n",
        this.heureDebut.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)),
        this.heureDebut.plusMinutes(this.duree).format(
            DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)), this.duree);
    }

    public MedecinGeneraliste getMedecin(){
        return medecin;
    }
}
