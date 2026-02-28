package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 meses
        // 31,28,31,30,31 dias
        int [] [] dias = new int [5] [31];
        dias  [0] [1] = 31;
        dias  [0] [2] = 28;
        dias  [0] [3] = 31;

        dias  [1] [1] = 28;
        dias  [1] [2] = 31;
        dias  [1] [3] = 30;

        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++){
                if (dias[i] [j] !=0){
                    System.out.println("Mes " + (i + 1) + " Dia " + (j + 1) + " tem " + dias [i] [j] + " dias");
                }
                //System.out.println(dias [i] [j]);
            }
            for(int [] arrBase: dias){
                for (int num: arrBase){
                    System.out.println(num);
                }

            }
        }

        //System.out.println(dias [0] [1]);

    }
}
