package Jogodavelha;
import  java.util.Scanner;
public class Jogodovelha {
    public static void main(String[] args) {

        Campo[][] velha = new Campo[3][3];
        for(int l=0; l <3 ;l++) {
            for (int c = 0; c < 3; c++) {
                velha[l][c] = new Campo();
            }
        }
        char simboloAtual = 'X';
        boolean game = true;
        String vitoria = "";
        Scanner scan = new Scanner(System.in);

        while (game) {
        desenhaJogo(velha);
            System.out.println("Sua vez ! Digite a linha (0,1 ou 2);");
            int linha = scan.nextInt();
            System.out.println("Digite a coluna (0, 1 ou 2);");
            int coluna = scan.nextInt();
            if(velha[linha][coluna].getSimbolo() == ' ') {
                velha[linha][coluna].setSimbolo('X');
                if (simboloAtual == 'X') {
                    simboloAtual = 'O';
                } else {
                    simboloAtual = 'X';
                }
            }
            else{
                System.out.println("Campo ja ocupado ! tente outro.");
            }


        }
    }
        public static void desenhaJogo(Campo[][] velha){
        //limpar a tela();
            System.out.println("  0   1   2");
            System.out.printf("0 %c | %c | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
            System.out.println("    --------");
            System.out.printf("0 %c | %c | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
            System.out.println("    --------");
            System.out.printf("0 %c | %c | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());

        }
    }

