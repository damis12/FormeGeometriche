package geometry_tools;

public class Rettangolo implements Forme{

	//parametri della classe Rettangolo
	private int altezza;
	private int larghezza;
	private Punto vertice;
	private String colore;
	
	//Costruttore della classe Rettangolo
	public Rettangolo(Punto vertice, int larghezza, int altezza, String colore) {
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.vertice = new Punto(vertice.getX(), vertice.getY());
		this.colore = colore;
	}
	
	@Override
	public void trasla(int x, int y) {
		this.vertice.setX(this.vertice.getX() + x);
		this.vertice.setY(this.vertice.getY() + y);
	}

	//Getters Setters altezza, colore, larghezza, vertice//
	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
	public Punto getVertice() {
		return vertice;
	}
	//Getters Setters altezza, colore, larghezza, vertice//

	@Override
	public String toString() {
		return "Rettangolo: [altezza=" + altezza + ", larghezza=" + larghezza + ", vertice=" + vertice.toString() + ", colore="
				+ colore + "]";
	}

}
