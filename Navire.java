package batailleNavale;

public class Navire {
		private Coordonnee debut;
	private Coordonnee fin;
	private Coordonnee[] partiesTouchees;
	private int nbTouchees;
	
	
	//constructeur :
	public Navire(Coordonnee debut, int longueur, boolean estVertical) {
		this.debut = debut;
		if (estVertical) {
			fin = new Coordonnee(debut.getLigne() + longueur - 1, debut.getColonne());
		}
		else {
			fin = new Coordonnee(debut.getLigne(), debut.getColonne() + longueur - 1);
		}
		partiesTouchees = new Coordonnee[longueur];
		nbTouchees = 0;
	}
	
	// méthodes :
	
	// retourne une représentation textuelle du navire
	public String toString() {
		if (this.debut.getLigne() == this.fin.getLigne()) //horizontal
			return ("Navire(" + debut + ", " + (fin.getColonne() - debut.getColonne()) + " horizontal)");
		return ("Navire(" + debut + ", " + (fin.getLigne() - debut.getLigne()) + " vertical"); // vertical
	}

	// retournent respectivement les coordonnées de début et de fin du navire.
	public Coordonnee getDebut() {
		return this.debut;
	}
	public Coordonnee getFin() {
		return this.fin;
	}
	
//	public boolean contient(Coordonnee c) {...}
//	public boolean touche(Navire n) {...}
//	public boolean chevauche(Navire n) {...}
//	public boolean recoitTir(Coordonnee c) {...}
//	public boolean estTouche(Coordonnee c) {...}
//	public boolean estTouche() {...}
//	public boolean estCoule() {...}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
