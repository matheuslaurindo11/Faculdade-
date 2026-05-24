package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
    double valortotal = 30000;
    for(int parcela = 1; parcela <= valortotal; parcela++){
        double valorparcela = valortotal / parcela;
        if(valorparcela < 1000){
            break;
        }
        System.out.println("Valor da parcela " + parcela + " RS " + valorparcela);

        }

    }
    }
