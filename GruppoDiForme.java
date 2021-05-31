package geometry_tools;

public class GruppoDiForme implements Forme{
	
	/*Viene creato l’array formeGeometriche in cui 
	ogni elemento è del tipo classe GruppoDiForme.
	Ogni elemento è pronto a contenere un riferimento
	a un oggetto di quel tipo ma per il momento ogni 
	elemento contiene un riferimento a un oggetto null.*/
	GruppoDiForme[] formeGeometriche = new GruppoDiForme[10];
	
	
	@Override
	public String toString() {
		return "GruppoDiForme [gruppoDiForme=" + formeGeometriche + "]";
	}

	/*trasla tutto il raggruppamento
	 * (cioè tutti gli oggetti che compongono il raggruppamento).*/
	@Override
	public void trasla(int x, int y) {
//		Rettangolo r1;
//		r1.vertice.setX(r1.vertice.getX() + x);
//		r1.vertice.setY(r1.vertice.getY() + y);
//		
//		Cerchio c1;
//		c1.centro.setX(c1.centro.getX() + x);
//		c1.centro.setY(c1.centro.getY() + y);
	}

}
