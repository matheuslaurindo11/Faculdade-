package academy.devdojo.maratonajava.introducao;
public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / * % ++ --
        int numero1 = 20;
        int numero2 = 20;
        int resultado = numero1 + numero2;
        System.out.println(numero1 + numero2);
        System.out.println("--------------------");
        ///  %
        int resto = 20 % 3;
        System.out.println(resto);
        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean IsDezDiferenteDeVinte = 10 >+ 20;
        System.out.println ("isDezMaiorQueVinte" + isDezMaiorQueVinte);
        System.out.println ("isDezMenorQueVinte" + isDezMenorQueVinte);
        System.out.println ("isDezIgualAVinte" + isDezIgualAVinte);
        System.out.println ("IsDezDiferenteDeVinte" + IsDezDiferenteDeVinte);

        // && (AND) || (OR) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueeTrinta = idade >= 30 && salario > 4612F;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381F;
        System.out.println("isDentroDaLeiMaiorQueeTrinta" + isDentroDaLeiMaiorQueeTrinta);
        System.out.println("----------------");
        System.out.println("isDentroDaLeiMenorQueTrinta" + isDentroDaLeiMenorQueTrinta);
        System.out.println("----------------");

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float ValorPlaystation = 5000F;
        boolean IsplaystationCompravel = valorTotalContaCorrente > ValorPlaystation || valorTotalContaPoupanca > ValorPlaystation;
        System.out.println("Eu Consigo comprar um playstation 5 " + IsplaystationCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);
        ///
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 =0;
        System.out.println(++contador2);



    }
}
