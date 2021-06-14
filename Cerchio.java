package geometry_tools;

public class Cerchio implements Forme{
	
	//parametri della classe Cerchio
	private int raggio;
	private Punto centro;
	private String colore;

	//Coostruttore della classe Cerchio
	public Cerchio(Punto centro, int raggio, String colore) {
		this.raggio = raggio;
		this.centro = new Punto(centro.getX(), centro.getY());
		this.colore = colore;
	}
	
	@Override
	public void trasla(int x, int y) {
		this.centro.setX(this.centro.getX() + x);
		this.centro.setY(this.centro.getY() + y);	
	}
	
	/////////Getters and Setters di raggio, colore, centro/////////
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
	public Punto getCentro() {
		return centro;
	}	
	/////////Getters and Setters di raggio, colore, centro/////////

	@Override
	public String toString() {
		return "Cerchio: [centro=" + centro.toString() + ", raggio=" + raggio + ", colore=" + colore + "]";
	}
	
}
