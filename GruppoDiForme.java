package geometry_tools;

import java.util.*;

public class GruppoDiForme implements Forme{
	
	/*Viene creato l’array formeGeometriche in cui 
	ogni elemento è del tipo classe Forma.
	Ogni elemento è pronto a contenere un riferimento
	a un oggetto di quel tipo ma per il momento ogni 
	elemento contiene un riferimento a un oggetto null.*/
	Forme[] formeGeometriche = new Forme[10];
	
	
	@Override
	public String toString() {
		return "GruppoDiForme [gruppoDiForme=" + formeGeometriche + "]";
	}

	@Override
	public void trasla(int x, int y) {
		
	}


}
