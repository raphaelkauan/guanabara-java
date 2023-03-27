package curso.gustavo.guanabara.java;

import java.util.Scanner;
import java.util.Locale;

public class CalcularIdade {

	public static void main(String[] args) {
		// criando o objeto scanner
		Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o ano atual: ");
		int ano = teclado.nextInt();

		System.out.println("Digite seu ano de nascimento: ");
		int anoNasc = teclado.nextInt();

		int idade = ano - anoNasc;
		System.out.println("Sua idade e " + idade);
	}

}
