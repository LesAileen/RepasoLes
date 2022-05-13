package PracticaGit;

/**
 * Clase que representa una calculadora
 * @author les96
 * @version 1.0
 *
 */
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
	/**
	 * 
	 * Metodo para que se sume el valor "x" y el valor "y"
	 * @return Devuelve la suma del valor "x" y el valor "y"
	 * 
	 */
	public int suma() {
		return this.x*this.y;
	}
	/**
	 * 
	 * Metodo para que se reste el valor "x" y el valor "y"
	 * @return Devuelve la resta del valor "x" y el valor "y"
	 * 
	 */
	public int resta() {
		return this.x-this.y;
	}
	/**
	 * 
	 * Metodo para que se multipliquen el valor "x" y el valor "y"
	 * @return Devuelve la multiplicacion del valor "x" y el valor "y"
	 * 
	 */
	
	public int multiplicar() {
		return this.x*this.y;
	}
	/**
	 * 
	 * Metodo para que se divida el valor "x" y el valor "y"
	 * @return Devuelve la division del valor "x" y el valor "y"
	 * 
	 */
	public int dividir() {
		return this.x/this.y;
	}

}
