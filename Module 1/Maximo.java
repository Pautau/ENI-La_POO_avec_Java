import java.util.Scanner;

public class Maximo {
	public static void main(String[] args) {

		String nbPremiers = "";
		int limite = saisirInt("Veuillez saisir la limite de recherche :");

		if (limite >= 2) {
			nbPremiers = "2";
		}

		for (int nbr = 3; nbr <= limite; nbr += 2) {

			int nbDiviseurs = 0;
			int compteur = 3;

			while ((nbDiviseurs <= 1) && (compteur <= nbr)) {
				if ((nbr % compteur) == 0) {
					nbDiviseurs++;
				}
				compteur += 2;
			}

			if (nbDiviseurs == 1) {
				nbPremiers += ", " + nbr;
			}
		}

		if (nbPremiers.isEmpty()) {
			nbPremiers = "Aucun r�sultat";
		}

		System.out.println("Les nombres premiers de 0 � " + limite + " sont :");
		System.out.println(nbPremiers);

	}

	/**
	 * 
	 * Affiche un message et retourne une saisie de type Int
	 * 
	 * @param message
	 *            � afficher
	 * @return La saisie entr�e par l'utilisateur
	 */
	private static int saisirInt(String message) {
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

}
