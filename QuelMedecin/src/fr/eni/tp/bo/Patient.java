package fr.eni.tp.bo;

import java.time.LocalDate;

public class Patient {
	private String nom;
	private String prenom;
	private String tel;
	private char sexe;
	private long secuSociale; 
	private LocalDate naissance;
	private String commentaire;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param tel
	 * @param sexe
	 * @param secuSociale
	 * @param naissance
	 * @param commentaire
	 */
	public Patient(String nom, String prenom, String tel, char sexe, long secuSociale, LocalDate naissance,
			String commentaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.sexe = sexe;
		this.secuSociale = secuSociale;
		this.naissance = naissance;
		this.commentaire = commentaire;
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

	public String getSexe() {
		if(sexe == 'F') {
			return "Féminin";
		} else {
			return "Masculin";
		}
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	public long getSecuSociale() {
		return secuSociale;
	}

	public void setSecuSociale(long secuSociale) {
		this.secuSociale = secuSociale;
	}

	public LocalDate getNaissance() {
		return naissance;
	}

	public void setNaissance(LocalDate naissance) {
		this.naissance = naissance;
	}

	public String getCommentaire() {
		if(commentaire == null) {
			return "Aucun commentaire.";
		} else {
			return commentaire;
		}
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	public void afficher() {
		System.out.println(getNom() + " " + getPrenom() + 
				"\n Téléphone : " + getTel() +
				"\n Sexe : " + getSexe() +
				"\n Numéro de sécurité sociale : " + getSecuSociale() +
				"\n Date de naissance : " + getNaissance() +
				"\n Commentaires : " + getCommentaire());
	}
}
