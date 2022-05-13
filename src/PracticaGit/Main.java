package PracticaGit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		
		System.out.println("--- Calculadora ---");
		
		System.out.println("Introduce el primer numero");
		x = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		y = sc.nextInt();
		
		Calculadora calculadora = new Calculadora(x,y);
		
		System.out.println("La suma de "+x+" y de "+y+" es: "+calculadora.suma());
		System.out.println("La resta de "+x+" y de "+y+" es: "+calculadora.resta());

	}

}
