package fr.eni.tp.bo;

import fr.eni.tp.bo.Adresse;

public class MedecinGeneraliste {
	private String nom;
	private String prenom;
	private String tel;
	private static int tarif;
	private Adresse adresse;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param tel
	 */
	public MedecinGeneraliste(String nom, String prenom, String tel, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public static int getTarif() {
		return tarif;
	}

	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}
	
	
	public void afficherAdresse() {
		adresse.afficher();
	}

	public void afficher() {
		System.out.println(getNom() + " " + getPrenom() +  
				"\n Téléphone : " + getTel() +
				"\n Tarif : " + getTarif() +
				"\n Adresse : ");
		afficherAdresse();
	}

}
