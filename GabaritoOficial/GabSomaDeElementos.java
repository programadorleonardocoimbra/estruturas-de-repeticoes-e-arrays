package GabaritoOficial;

//1. Soma de elementos:
  //Crie um programa que leia 5 números inteiros, armazene em um array e mostre a soma total.


public class GabSomaDeElementos {
    public static void main(String[] args) {
        int[] v = new int[5];
        int soma = 0;

        for(int i = 0; i < 5; i++) {
            v[i] = i + 1;
            soma += v[i];

        }
        System.out.println("Soma é: " + soma);


    }
}
