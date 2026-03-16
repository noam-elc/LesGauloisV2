package personnages;


public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;

	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
		chaudron = new Chaudron();
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + " Je suis le druide " + nom + " : \"" + texte + " \"");
	}

	public String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		parler("J'ai concocté " + chaudron.get);
		chaudron.remplirChaudron(quantite, forcePotion);
	}
	
	public void booster(Gaulois gaulois) {
		if (chaudron.restePotion()) {
			parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
			int forcePotion = chaudron.prendreLouche();
			gaulois.boirePotion(forcePotion);
		} else {
			parler("Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion.");
		}
	}
	
	public String getNom() {
		return nom;
	}
}
