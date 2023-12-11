package batailleNavale;

public class GrilleNavale {
public GrilleNavale(int taille, int[] taillesNavires) {
	    this(taille,taillesNavires.length);
		placementAuto(taillesNavires);
		
	}
		public GrilleNavale(int taille, int nbNavires) {
			this.taille=taille;
			this.nbNavires=0;
			this.navires=new Navire[nbNavires];
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
