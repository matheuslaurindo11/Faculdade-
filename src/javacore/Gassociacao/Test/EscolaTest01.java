package javacore.Gassociacao.Test;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor Professor1 = new Professor ("Matheus");
        Professor Professor2 = new Professor ("Maria");
        Professor [] professores = {Professor1, Professor2};

        Escola escola = new Escola("Konoha", professores);
        escola.imprime();
    }
}
