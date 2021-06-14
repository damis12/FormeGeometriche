package geometry_tools;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CerchioTest {
	@Test
	public void testTrasla() {
		
		System.out.println("---- TEST ---- TRASLA CERCHIO...\n");
		
		Punto p1 = new Punto(2, -1);
		Cerchio c1 = new Cerchio(new Punto(-1, -3), 4, "blu");
		
		System.out.println((c1.toString()));
		
		c1.trasla(3, 2);
		
		System.out.println(c1.toString());
		
		assertEquals(c1.getCentro().getX(), p1.getX(), "Test fallito!");
		assertEquals(c1.getCentro().getY(), p1.getY(), "Test fallito!");
		
		System.out.println("IL TEST HA AVUTO SUCCESSO !");
	}
}
