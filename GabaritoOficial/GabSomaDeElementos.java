package GabaritoOficial;

//1. Soma de elementos:
    //  Crie um programa que leia 5 números inteiros, armazene em um array e mostre a soma total.
       //  Ideia: usar o for para percorrer o array e acumular valores.

public class GabSomaDeElementos {
    public static void main(String[] args) {
        int[] v = new int[5]; // Cria um array com 5 posições
        int soma = 0; // Variável acumuladora

        for(int i = 0; i < 5; i++) { // Loop para percorrer o array
            v[i] = i + 1; // Atribui valores (1+2+3+4+5 = 15)
            soma += v[i]; // Soma cada elemento ao total

        }
        System.out.println("Soma é: " + soma); //Imprime a RESPOSTA


    }
}
