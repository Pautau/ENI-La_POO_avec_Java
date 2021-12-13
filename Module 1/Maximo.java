import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Maximo {

	public static final String CHEMIN_FICHIER = "Module 1/Ressources/dictionnaire.txt";
	public static final int NB_MOTS = 22506;
	public static Random r = new Random();

	public static void main(String[] args) {

		try {
			// Tirage du mot aléatoirement
			String mot = tirerMotAleatoirement().toLowerCase();
			System.out.println("DEBUG: Mot à trouver = " + mot);

			// Mélange du mot
			char[] motMelange = melanger(mot);

			// Vérification de la saisie de l'utilisateur
			boolean correct = false;
			while (!correct){
				// Saisie de l'utilisateur 
				char[] saisie = saisieUtilisateur(motMelange);

				correct = bonnesLettres(saisie, mot.toCharArray());
				//correct = dansLeDico(saisie);
				System.out.println("RESULTAT: " + correct);
			}
			
		} catch (IOException e) {
			System.err.println("ERREUR : " + e );
		}

	}

	/**
	 * 
	 * @param saisie
	 * @param mot
	 * @return boolean
	 */
	private static boolean bonnesLettres(char[] saisie, char[] motMelange) {
		System.out.println("\nDEBUG: -- Vérification des lettres --");
		int lettresValides = 0;
		
		/* Parcourt chaque caractère de la saisie et les compare avec ceux du mot, 
		si un caractère de saisie est trouvé dans le mot, il est remplacé par un caractère vide dans les deux variables */
		try {
			for (int i = 0; i < saisie.length; i++) {
				for (int j = 0; j < motMelange.length; j++) {
					if(saisie[i] == motMelange[j]){
						motMelange[j] = ' ';
						lettresValides++;
						break;
					}
				}
			}
		} catch (Exception e) {
			System.err.println("ERREUR : " + e );
		}

		System.out.println("----- Saisie");
		System.out.println(saisie);
		System.out.println("----- Mot mélangé");
		System.out.println(motMelange);

		// Vérifie si la saisie comporte les mêmes lettres que le mot 
		if (lettresValides == motMelange.length) {
			return true;
		} else {
			return false;
		}
	}

	/*
	private static boolean dansLeDico(char[] saisie){
		System.out.println("DEBUG: -- Recherche d'une correspondance --");
		try (FileInputStream fichier = new FileInputStream(CHEMIN_FICHIER);
			Scanner s = new Scanner(fichier)) {
				int numLigne = r.nextInt(NB_MOTS);
				for (int i = 0; i < numLigne-1; i++) {
					s.nextLine();
				}
				return s.nextLine();
			}
	}
	*/

	/**
	 * Demande à l'utilisateur de saisir un mot
	 * @param motMelange
	 * @return char[]
	 */
	private static char[] saisieUtilisateur(char[] motMelange){

		System.out.println("\nDEBUG: -- Saisie de l'utilisateur --");
		System.out.println("Pouvez-vous trouver le mot mélangé ? (minuscules)");
		System.out.println(String.valueOf(motMelange));
		Scanner s = new Scanner(System.in); 
		String saisie = s.nextLine();

		return saisie.toCharArray();
	}

	/**
	 * Mélange les lettres d'un mot aléatoirement
	 * @param mot
	 * @return char[]
	 */
	private static char[] melanger(String mot) {
		System.out.println("\nDEBUG: -- Mélange du mot --");

		char[] motTableau = mot.toCharArray();
		char[] motMelange = motTableau;
		int aleatoire = 0;
		char temporaire = 'a';

		try {
			// Mélange du mot
			for (int i = 0; i < motTableau.length; i++) {
				aleatoire = r.nextInt(motTableau.length);
				temporaire = motMelange[i];
				motMelange[i] = motTableau[aleatoire];
				motTableau[aleatoire] = temporaire;
			}

		} catch (Exception e) {
			System.out.println("ERREUR : " + e);
		}
		return motMelange;
	}

	/**
	 * Retourne un mot tiré aléatoirement
	 * @return String
	 * @throws IOException
	 */
	private static String tirerMotAleatoirement() throws IOException {
		System.out.println("\nDEBUG: -- Tirage du mot aléatoire. --");

		try (FileInputStream fichier = new FileInputStream(CHEMIN_FICHIER);
			Scanner s = new Scanner(fichier)) {
				int numLigne = r.nextInt(NB_MOTS);
				System.out.println("DEBUG: Numéro de ligne = " + numLigne);
				for (int i = 0; i < numLigne-1; i++) {
					s.nextLine();
				}
				return s.nextLine();
			}
	}
}
