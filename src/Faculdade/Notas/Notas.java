package Faculdade.Notas;

import java.util.Scanner;

    public class Notas {
        public static void main(String[] args) {
            // Scanner com "S" maiúsculo
            Scanner teclado = new Scanner(System.in);

            String[] materias = {"Matemática", "Português", "Ciências", "História", "Geografia"};
            String[] alunos = new String[5];
            double[][] notas = new double[5][2];

            int x = 0;

            // O loop para preencher os nomes
            while (x < 5) {
                System.out.println("Digite o nome do Aluno " + (x + 1) + ":");
                // Nome da variável corrigido para 'alunos' e finalizado com ';'
                alunos[x] = teclado.nextLine();
                x++;
            }

            // Exemplo simples de exibição
            System.out.println("Lista de alunos preenchida com sucesso!");
        }
    }
