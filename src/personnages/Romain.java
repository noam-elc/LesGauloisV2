package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified() : "La force du Romain doit être positive";
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert forceCoup>0 : "Pré-Condition";
        force -= forceCoup;
        if (force > 0) {
            parler("Aïe");
        } else {
        	parler("J'abandonne !");
        }
        assert isInvariantVerified() : "La force du Romain doit être positive";
    }
	
	private boolean isInvariantVerified() {
		return (force >= 0);
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
	}
}
