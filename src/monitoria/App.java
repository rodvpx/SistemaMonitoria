package monitoria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
                    //Usuario.fazerLogin(sc);
                    break;

                case 2:
                    Aluno aluno = new Aluno("Lucas", "admin", "admin", "1234567898");
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
