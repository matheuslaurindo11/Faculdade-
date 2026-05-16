package test;
import javacore.introducaoclasses.dominio.Professor;
public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Matheus";
        professor.idade = 26;
        professor.especialidade = "Java";
        System.out.println("Nome:"+  professor.nome +  " idade:" + professor.idade +  " sexo:" + professor.sexo +  " especialidade:" + professor.especialidade);

    }


}
