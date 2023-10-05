package algoritimos.io;

import java.util.Scanner;

public class A01_ComandosDeEntrada {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = leitor.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = leitor.nextInt();
		System.out.println("Digite sua altura: ");
		double altura = leitor.nextDouble();
		System.out.println("Digite seu peso: ");
		double peso = leitor.nextDouble();
		System.out.println("Doador de sangue?");
		boolean ehDoadorDeSangue = leitor.nextBoolean();
		System.out.println("Tipo Sanguineo:");
		char tipoSanguineo = leitor.next().charAt(0);
		System.out.println("Fator RH:");
		char fatorRh = leitor.next().charAt(0);

		System.out.println("O nome digitado foi: " + nome);
		System.out.println("A idade digitada foi: " + idade);
		System.out.println("A altura digitada foi: " + altura);
		System.out.println("O peso digitado foi: " + peso);
		System.out.println("E doador: " + ehDoadorDeSangue);
		System.out.print("Tipo Sanguineo: " + tipoSanguineo);
		System.out.println(fatorRh);

		leitor.close();

	}

}
