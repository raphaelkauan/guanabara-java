package curso.gustavo.guanabara.java;

import java.util.Scanner;

public class TiposPrimitivos {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o nome do Aluno: ");
    String nome = teclado.nextLine();
    System.out.println("Digite a nota do Aluno: ");
    float nota = teclado.nextFloat();

    System.out.println("O nome do aluno e " + nome + " E sua nota e " + nota);
  }

}
