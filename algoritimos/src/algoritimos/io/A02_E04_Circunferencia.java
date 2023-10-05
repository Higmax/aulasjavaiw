package algoritimos.io;

import java.util.Scanner;

public class A02_E04_Circunferencia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		
		int raio = 2;
		
		double Circ = 2 * Math.PI * raio;
		double area = Math.PI* Math.pow(raio,2);
		
		System.out.println(Circ);
		System.out.println(area);
	}

}
