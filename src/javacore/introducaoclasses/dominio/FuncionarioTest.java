package javacore.introducaoclasses.dominio;
import javacore.Bintroducaometodos.dominio.test.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Matheus");
        funcionario.setIdade(26);
        funcionario.setSalarios( new double[] {1000 , 2000 ,3400});
        funcionario.imprime();
        funcionario.imprimeMediaSalarios();
        System.out.println("Media " + funcionario.getMedia());
        {
            //System.out.println( "Funcionario " +funcionario.nome);
            ///System.out.println( "Idade " + funcionario.idade);
            //System.out.println( "Cargo " + funcionario.cargo);
            //System.out.println( "Meu Salario " + funcionario.salario[0]);
           // System.out.println( "Meu Segundo Salario " + funcionario.salario[1]);
            //System.out.println( "Meu Terceiro Salario " + funcionario.salario[2]);
        }


    }
}
