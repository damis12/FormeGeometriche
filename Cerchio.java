package geometry_tools;

public class Cerchio implements Forme{
	
	private int raggio;
	private Punto centro;
	private String colore;

	//Constructor
	public Cerchio(int raggio, Punto centro, String colore) {
		this.raggio = raggio;
		this.centro = new Punto(centro.getX(), centro.getY());
		this.colore = colore;
	}
	
	@Override
	public void trasla(int x, int y) {
		this.centro.setX(this.centro.getX() + x);
		this.centro.setY(this.centro.getY() + y);	
	}
	
	//Getters and Setters raggio, colore
	public int getRaggio() {
		return raggio;
	}
	public void setRaggio(int raggio) {
		this.raggio = raggio;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}

	@Override
	public String toString() {
		return "Cerchio [raggio=" + raggio + ", centro=" + centro + ", colore=" + colore + "]";
	}	
	
}
