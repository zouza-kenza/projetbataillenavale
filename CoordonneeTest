package batailleNavale;
import static org.junit.Assert.*;
import org.junit.Test;
public class CoordonneeTest {

	@Test
	public void TestCoordonneeCreation(){
		Coordonnee coordonnee =new Coordonnee(1 ,4);
		assertEquals(1 ,coordonnee.getLigne());
		assertEquals(4 ,coordonnee.getColonne());
		
	}
	public void TestCoordonneeToString() {
		Coordonnee coordonnee =new Coordonnee(5 ,2);
		assertEquals("C6" ,coordonnee.toString());
		
	}
	 @Test
	    public void testCoordonneeEquals() {
	        Coordonnee coordonnee1 = new Coordonnee(3, 4);
	        Coordonnee coordonnee2 = new Coordonnee(3, 4);
	        Coordonnee coordonnee3 = new Coordonnee(2, 5);

	        assertTrue(coordonnee1.equals(coordonnee2));
	        assertFalse(coordonnee1.equals(coordonnee3));
	    }
	 public void testCoordonneeVoisine() {
		    Coordonnee coordonnee1 = new Coordonnee(3, 4);
	        Coordonnee coordonnee2 = new Coordonnee(4, 4);
	        Coordonnee coordonnee3 = new Coordonnee(3, 5);
	        Coordonnee coordonnee4 = new Coordonnee(1, 1);
	        
	        assertTrue(coordonnee1.voisine(coordonnee2));
	        assertTrue(coordonnee1.voisine(coordonnee3));
	        assertFalse(coordonnee1.voisine(coordonnee4));
	 }
	public void testCoordonneeCompareTo() {
		 Coordonnee coordonnee1 = new Coordonnee(3, 4);
	        Coordonnee coordonnee2 = new Coordonnee(3, 5);
	        Coordonnee coordonnee3 = new Coordonnee(2, 4);
	        assertTrue(coordonnee1.compareTo(coordonnee2)<0);
	        assertTrue(coordonnee1.compareTo(coordonnee3)>0);
	        assertEquals(0, coordonnee1.compareTo(coordonnee1));

	}
	
}
