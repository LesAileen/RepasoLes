package PracticaGit;

public class Calculadora {
	
	private int x;
	private int y;

	public Calculadora() {
		
	}

	public Calculadora(int x, int y) {
		this.x = x;
		this.y = y;
	}

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
	
	public int suma() {
		return this.x*this.y;
	}
	
	public int resta() {
		return this.x-this.y;
	}
	
	
	
	
	

}
