package geometry_tools;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class RettangoloTest {
	@Test
	public void testTrasla() {
		
		System.out.println("---- TEST ---- TRASLA RETTANGOLO...\n");
		
		Rettangolo r1 = new Rettangolo(new Punto(1, 1), 5, 7, "rosso");
		System.out.println(r1.toString());
		
		r1.trasla(3, 2);
		System.out.println(r1.toString());
		
		
		//asserisce che c1 dopo la traslazione si trova a p1 = (4, 3);
		assertEquals(new Punto(2, -1), r1.getVertice(), "Test fallito!");
		
		System.out.println("IL TEST HA AVUTO SUCCESSO !");
	}

}
