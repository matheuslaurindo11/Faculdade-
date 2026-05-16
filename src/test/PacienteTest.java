package test;
 import javacore.introducaoclasses.dominio.Paciente;
public class PacienteTest {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        System.out.println("Nome "  + paciente.nome);
        System.out.println("Idade "  + paciente.idade);
        System.out.println("Sexo " + paciente.sexo);
        System.out.println("Cpf " + paciente.cpf);
        System.out.println("Endereco " + paciente.endereco);
        System.out.println("Telefone"  + paciente.telefone);
        System.out.println("Rg "  + paciente.rg);
    }
}

