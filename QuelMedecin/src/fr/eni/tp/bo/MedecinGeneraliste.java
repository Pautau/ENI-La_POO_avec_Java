package fr.eni.tp.bo;

public class MedecinGeneraliste {
	private String nom;
	private String prenom;
	private String tel;
	private static int tarif;
	private Adresse adresse;
	private Creneau[] creneaux = new Creneau[15]; 
	
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

	void ajouterCreneau(Creneau creneauAAjouter) {
		if(this != creneauAAjouter.getMedecin()) {
			System.err.println("Ce créneau ne peux être associé à ce médecin car il est déjà associé à un autre");
		} else {
			int pos = 0;
			while (pos < this.creneaux.length && this.creneaux[pos] != null)
			pos++;
			if (pos == this.creneaux.length) {
				System.err.println("Trop de créneaux sont affectés à ce médecin");
			}
			else {
				this.creneaux[pos] = creneauAAjouter;
			}
		}
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
		System.out.println("Creneaux :");
		for (int i = 0; i < this.creneaux.length; i++){
			if(this.creneaux[i] != null){
				this.creneaux[i].afficher();
			}
		}
	}

}
