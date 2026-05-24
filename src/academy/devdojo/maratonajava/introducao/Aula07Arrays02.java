package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        // byte, short, int, long, float, double, char, boolean 0
        // char '\u0000' (valor default 0 )
        //boolean false (valor default)
        // string null (valor default 0)
        String [] nomes = new String[4];
        nomes[0] = "Matheus";
        nomes[1] = "Toph";
        nomes[2] = "Aang";
        nomes[3] = "Zuko";
        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);

        }

    }
}
