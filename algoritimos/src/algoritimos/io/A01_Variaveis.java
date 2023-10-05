package algoritimos.io;

public class A01_Variaveis {

	public static void main(String[] args) {

		final String NOME = "Diego";

		String nome = "Saulo";
		int idade = 38;
		float altura = 1.76f;
		double peso = 79.2;
		boolean ehDoadorDeSangue = true;
		char tipoSanguineo = 'A';
		char fatorRh = '+';

		// System.out.println("nome: " +nome);
		// System.out.println("idade: "+idade);
		// System.out.println("Altura: "+altura);
		// System.out.println("Peso: "+peso);
		// System.out.println("Doador: "+ehDoadorDeSangue);
		// System.out.print("Tipo sanguineo: "+tipoSanguineo);
		// System.out.println(fatorRh);

		System.out.printf(" nome: %s\n idade: %d\n Altura: %f\n Peso: %f\n Doador: %b\n Tipo Sanguineo: %c\n", nome,
				idade, altura, peso, ehDoadorDeSangue, tipoSanguineo, fatorRh);
	}

}
