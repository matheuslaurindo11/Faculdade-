package Faculdade.Notas;

import java.util.Scanner;

public class Produto {
    public String marca;
    public String modelo;
    public String cod_barras;
    public float preco;
    public static void main(String[] args) {
        Produto p1 = new Produto("Samsung", "S20", "123456789", 2000);
        p1.mostrar();
    }
    public Produto(String m, String mo, String cb, float p){
        this.marca = m;
        this.modelo = mo;
        this.cod_barras = cb;
        this.preco = p;
        this.calcularImposto();
    }

    public void mostrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a marca do produto:");
        this.marca = sc.nextLine();
        System.out.println("Digite o modelo do produto:");
        this.modelo = sc.nextLine();
        System.out.println("Digite o codigo de barras do produto:");
        this.cod_barras = sc.nextLine();
        System.out.println("Digite o preco do produto:");
        this.preco = sc .nextFloat();
        System.out.println("valor do imposto: " + calcularImposto());
    }


    public float calcularImposto(){
        float imposto = this.preco - 901.10f;
        return imposto;
    }
}