package geometry_tools;

public class Punto {
	
	//parametri della classe Punto
	private int x, y;
	
	//Costruttore della classe punto
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//////////Getters and Setters per x, y//////
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	//////////Getters and Setters per x, y//////

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
