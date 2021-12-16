package fr.eni.tp.bo;

public class Adresse {
	private String mentionsComplementaires;
	private int numero;
	private String complNumero;
	private String rue;
	private int cp;
	private String ville;
	
	public Adresse(String mentionsComplementaires, int numero, String complNumero, String rue, int cp, String ville) {
		this.mentionsComplementaires = mentionsComplementaires;
		this.numero = numero;
		this.complNumero = complNumero;
		this.rue = rue;
		this.cp = cp;
		this.ville = ville;
	}
	
	public Adresse(int numero, String complNumero, String rue, int cp, String ville) {
		this(null, numero, complNumero, rue, cp, ville);
	}
	

	public void afficher() {
		if (this.mentionsComplementaires != null)
			System.out.println(mentionsComplementaires);
		// Nouvelle façon d'afficher dans la console
		System.out.printf("%d%s %s%n%05d %s%n", this.numero, this.complNumero != null ? this.complNumero : "", this.rue,
				this.cp, this.ville.toUpperCase());
	}
}
