package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //imprima o dia da semana considerando 1 como domingo

        byte dia = 10;
        switch (dia){
            case 1:
            System.out.println("Domingo");
                    break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("terca-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
            default:
                System.out.println("Dia Invalido");
                break;

        }
        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Maculino");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
        }
    }
}

