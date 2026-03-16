package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
	public boolean restePotion() {
		if (quantitePotion <= 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public int prendreLouche() {
		quantitePotion--;
		return forcePotion;
		
		
	}
}
