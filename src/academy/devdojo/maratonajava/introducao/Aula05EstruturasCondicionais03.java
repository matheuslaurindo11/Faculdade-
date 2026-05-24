package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        double salario = 4000;
        String mensagemdoar = "Eu vou doar 500 para o DevDojo";
        String Mensagemnaodoar = "Ainda nao tenho condicoes de doar";
        String resultado;
        // (condicao) ? verdadeiro : falso
        if (salario>5000){
            resultado = mensagemdoar;
            System.out.println(resultado);
            }else{
            System.out.println(Mensagemnaodoar);


        }

        }
}

