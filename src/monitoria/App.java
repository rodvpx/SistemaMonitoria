package monitoria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = null;

        int option = 0;

        do {

            System.out.println("--- SISTEMA MONITORIA ---");
            System.out.println("1 - Login");
            System.out.println("2 - Cadastro");
            System.out.println("0 - para sair");

            try {
                option = sc.nextInt();
                sc.nextLine(); // Limpar o buffer
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                sc.nextLine(); // Limpar o buffer
                continue; // Volta para o início do loop
            }

            switch (option) {
                case 0:
                    System.out.println("Saindo...");
                    break;

                case 1:
                    System.out.println("Informe o email/user:");
                    String email = sc.nextLine();
                    System.out.println("Informe a senha:");
                    String senha = sc.nextLine();
                    aluno.realizarLoginParaTodosAluno(email, senha);
                    break;

                case 2:
                    System.out.println("Informe a matricula:");
                    String m = sc.nextLine();
                    System.out.println("Informe o nome:");
                    String n = sc.nextLine();
                    System.out.println("Informe o email:");
                    String e = sc.nextLine();
                    System.out.println("Informe a senha:");
                    String s = sc.nextLine();
                    aluno = new Aluno(m, n, e, s);
                    aluno.cadastrarNovoUsuario();
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (option != 0);

        sc.close();
    }

}
