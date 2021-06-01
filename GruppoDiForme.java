package geometry_tools;

import java.util.ArrayList;

public class GruppoDiForme implements Forme{
	
	/*Viene creato l’array formeGeometriche in cui 
	ogni elemento è del tipo classe GruppoDiForme.
	Ogni elemento è pronto a contenere un riferimento
	a un oggetto di quel tipo ma per il momento ogni 
	elemento contiene un riferimento a un oggetto null.*/
	ArrayList<GruppoDiForme> formeGeometriche = new ArrayList<GruppoDiForme>(10);
	
	

	/*trasla tutto il raggruppamento
	 * (cioè tutti gli oggetti che compongono il raggruppamento).*/
	@Override
	public void trasla(int x, int y) {
//		Rettangolo r1 = new Rettangolo(new Punto(-1, -3), 3, 5, "rosso");
//		r1.vertice.setX(r1.vertice.getX() + x);
//		r1.vertice.setY(r1.vertice.getY() + y);
//		
//		Cerchio c1 = new Cerchio(5, new Punto(-1, -3), "verde");
//		c1.centro.setX(c1.centro.getX() + x);
//		c1.centro.setY(c1.centro.getY() + y);

	}
	
	public void aggiungiForma(GruppoDiForme forma) {

	}
	
	@Override
	public String toString() {
		return "GruppoDiForme [gruppoDiForme=" + formeGeometriche + "]";
	}

//	public static void main(String[] args) {
//		GruppoDiForme gf = new GruppoDiForme();
//		Rettangolo r1 = new Rettangolo(new Punto(-1, -3), 3, 5, "rosso");
//		gf.aggiungiForma(r1);
//		System.out.println(gf.toString());
//	}
}
