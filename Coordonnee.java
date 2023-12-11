package batailleNavale;

public class Coordonnee  implements Comparable<Coordonnee> {
	private int ligne;
	private int colonne;
	
	public Coordonnee(int ligne, int colonne) {
		if (ligne < 0 || ligne > 25 || colonne < 0 || colonne > 25) {
			throw new IllegalArgumentException("Les coordonnées de ligne et de colonne sont éronnées.");
		}
		this.ligne = ligne;
		this.colonne = colonne;
	}
	public Coordonnee(String s) {
		if (s.length() < 2 || s.length() > 3) {
			throw new IllegalArgumentException(
					"La coordonnee depasse les limites elle doit prendre 2 ou 3 caracteres)");
		}
		this.colonne = s.charAt(0) - 'A';
		this.ligne = Integer.parseInt(s.substring(1)) - 1;
		
	}
	public String toString() {
		String coordonnees = new String();
		return coordonnees + (char) (this.colonne + 'A') + (this.ligne + 1);
		
	}
	public int getColonne() {
		return this.colonne;
		
	}
	public int getLigne() {
		return this.ligne;
		
	}
	//	méthode qui teste l'égalité entre deux coordonnées
	public boolean equals(Object obj) {
		if (obj instanceof Coordonnee) {
			Coordonnee c = (Coordonnee) obj;
			return (this.ligne == c.ligne && this.colonne == c.colonne);
		}
		return false;
	}
	
	public boolean voisine(Coordonnee c) {
		return false;
		
	}
	@Override
	public int compareTo(Coordonnee c) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
