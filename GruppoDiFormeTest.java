package geometry_tools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class GruppoDiFormeTest {

	@Test
	public void testTrasla_GruppoSemplice() {
		
		System.out.println("---- TEST ---- Metodo 'trasla' del gruppo di forme semplice.");
		
		System.out.println('\n');
		
		Punto p1 = new Punto(1, 1);
		Punto p2 =new Punto(-1, -3);
		Punto p3 = new Punto(4, 3);
		Punto p4 =new Punto(2, -1);

		Rettangolo r1 = new Rettangolo(new Punto(1, 1), 5, 7, "rosso");
		Cerchio c1 = new Cerchio(new Punto(-1, -3), 4, "blu");
		GruppoDiForme g1 = new GruppoDiForme(r1, c1, null, null, null, null, null, null, null, null);
		
		System.out.println(g1.toString());
		
		assertEquals(p1.getX(), r1.getVertice().getX(), "Test fallito!");
		assertEquals(p2.getX(), c1.getCentro().getX(), "Test fallito!");
		assertEquals(p1.getY(), r1.getVertice().getY(), "Test fallito!");
		assertEquals(p2.getY(), c1.getCentro().getY(), "Test fallito!");
		
		g1.trasla(3, 2);
		
		
		System.out.println(g1.toString());
		
		assertEquals(p3.getX(), r1.getVertice().getX(), "Test fallito!");
		assertEquals(p4.getX(), c1.getCentro().getX(), "Test fallito!");
		assertEquals(p3.getY(), r1.getVertice().getY(), "Test fallito!!");
		assertEquals(p4.getY(), c1.getCentro().getY(), "Test fallito!");
		
		System.out.println("IL TEST HA AVUTO SUCCESSO !");

		System.out.println('\n');
	}
	
	@Test
	public void testTrasla_GruppoDiGruppi() {
		System.out.println("---- TEST ---- Metodo 'trasla' del gruppo di gruppi.");
		
		Punto p1 = new Punto(1, 1);
		Punto p2 =new Punto(-1, -3);
		Punto p3 =new Punto(-1, 2);
		Punto p4 = new Punto(4, 3);
		Punto p5 = new Punto(2, -1);
		Punto p6 = new Punto(2, 4);
		
		Rettangolo r1 = new Rettangolo(new Punto(1, 1), 5, 7, "rosso");
		Cerchio c1 = new Cerchio(new Punto(-1, -3), 4, "blu");
		
		GruppoDiForme g1 = new GruppoDiForme(r1, c1, null, null, null, null, null, null, null, null);
		Cerchio c2 = new Cerchio(new Punto(-1, 2), 2, "blu");
		
		GruppoDiForme g2 = new GruppoDiForme(g1, c2, null, null, null, null, null, null, null, null);
		
		System.out.println(g2.toString());
		
		assertEquals(p1.getX(), r1.getVertice().getX(), "Test fallito!");
		assertEquals(p2.getX(), c1.getCentro().getX(), "Test fallito!");
		assertEquals(p3.getX(), c2.getCentro().getX(), "Test fallito!");
		assertEquals(p1.getY(), r1.getVertice().getY(), "Test fallito!");
		assertEquals(p2.getY(), c1.getCentro().getY(), "Test fallito!");
		assertEquals(p3.getY(), c2.getCentro().getY(), "Test fallito!");
		
		g2.trasla(3, 2);
		
		System.out.println(g2.toString());
		
		assertEquals(p4.getX(), r1.getVertice().getX(), "Test completato con fallimento!");
		assertEquals(p5.getX(), c1.getCentro().getX(), "Test completato con fallimento!");
		assertEquals(p6.getX(), c2.getCentro().getX(), "Test completato con fallimento!");
		assertEquals(p4.getY(), r1.getVertice().getY(), "Test completato con fallimento!");
		assertEquals(p5.getY(), c1.getCentro().getY(), "Test completato con fallimento!");
		assertEquals(p6.getY(), c2.getCentro().getY(), "Test completato con fallimento!");
		
		System.out.println("IL TEST HA AVUTO SUCCESSO !");
		
	}
}
