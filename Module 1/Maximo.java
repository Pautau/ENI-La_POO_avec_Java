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
			String mot = tirerMotAleatoirement();
			System.out.println("DEBUG: Mot = " + mot);

			// Mélange du mot
			char[] motMelange = melanger(mot);

			// Saisie de l'utilisateur 


			// Vérification de la saisie de l'utilisateur
			boolean correct = false;
			while (!correct){
				char[] saisie = saisieUtilisateur(motMelange);
				correct = bonnesLettres(saisie, mot);
				correct = dansLeDico(saisie);
			}
			
		} catch (IOException e) {
			System.err.println("ERREUR : " + e );
		}

	}

	private static boolean bonnesLettres(char[] saisie, char[] mot) {
		System.out.println("DEBUG: -- Vérification des lettres --");
		for (int i = 0; i < saisie.length; i++) {
			for (int j = 0; j < mot.length; j++) {

			}
		}
	}

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

	private static char[] saisieUtilisateur(char[] motMelange){
		System.out.println("DEBUG: -- Saisie de l'utilisateur --");

		try {
			System.out.println("Pouvez-vous trouver le mot mélangé ? (minuscules)");
			System.out.println(String.valueOf(motMelange));
			Scanner s = new Scanner(System.in); 
			String saisie = s.nextLine();
			s.close();
			return saisie.toCharArray();
		} catch (Exception e) {
			System.err.println("ERREUR : " + e );
		}
		return null;
	}

	private static char[] melanger(String mot) {
		System.out.println("DEBUG: -- Mélange du mot. --");
		try {
			char[] motTableau = mot.toLowerCase().toCharArray();
			char[] motMelange = motTableau;
			int aleatoire = 0;
			char temporaire = 'a';
			// Mélange du mot
			for (int i = 0; i < motTableau.length; i++) {
				aleatoire = r.nextInt(motTableau.length);
				temporaire = motMelange[i];
				motMelange[i] = motTableau[aleatoire];
				motTableau[aleatoire] = temporaire;
			}
			return motMelange;
		} catch (Exception e) {
			System.out.println("ERREUR : " + e);
		}
		return null;
	}

	/**
	 * Retourne un mot tiré aléatoirement
	 * @return 
	 * @throws IOException
	 */
	private static String tirerMotAleatoirement() throws IOException {
		System.out.println("DEBUG: -- Tirage du mot aléatoire. --");
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
