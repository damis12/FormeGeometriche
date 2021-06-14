package geometry_tools;


public class GruppoDiForme implements Forme{
	/*Viene creato l’array formeGeometriche, di dimensione 10 in cui 
	ogni elemento è del tipo Forme.
	Ogni elemento è pronto a contenere un riferimento
	a un oggetto di quel tipo ma per il momento ogni 
	elemento contiene un riferimento a un oggetto null.
	*****************************************************/
	private Forme[] formeGeometriche = new Forme[10];
	
	//Costruttore della classe GruppoDiForme: popolo l'array di formeGeometriche
	public GruppoDiForme(Forme f1, 
							Forme f2, 
								Forme f3, 
									Forme f4, 
										Forme f5, 
											Forme f6, 
												Forme f7, 
													Forme f8, Forme f9, Forme f10) {
		
		this.formeGeometriche[0] = f1;
		this.formeGeometriche[1] = f2;
		this.formeGeometriche[2] = f3;
		this.formeGeometriche[3] = f4;
		this.formeGeometriche[4] = f5;
		this.formeGeometriche[5] = f6;
		this.formeGeometriche[6] = f7;
		this.formeGeometriche[7] = f8;
		this.formeGeometriche[8] = f9;
		this.formeGeometriche[9] = f10;
	}

	/*trasla tutto il raggruppamento
	 * (cioè tutti gli oggetti che compongono il raggruppamento).*/
	@Override
	public void trasla(int x, int y) {
		for (int i = 0; i < formeGeometriche.length; i++) {
			if(this.formeGeometriche[i] != null) {
				this.formeGeometriche[i].trasla(x, y);
			}
		}
	}
	
	@Override
	public String toString() {
		StringBuilder stringa = new StringBuilder("");
		for(int i = 0; i < formeGeometriche.length; i++) {
			if(this.formeGeometriche[i] != null) {
				stringa.append(this.formeGeometriche[i].toString());
				stringa.append("\n");
			}
		}
		return stringa.toString();
	}

}
