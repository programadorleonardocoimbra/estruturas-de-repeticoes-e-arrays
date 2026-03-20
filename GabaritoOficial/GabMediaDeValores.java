package GabaritoOficial;

// 3. Média de valores
    //  Leia 8 números reais, armazene em um array e calcule a média.
        //  Ideia: somar tudo e dividir pelo tamanho do array.

public class GabMediaDeValores {
    public static void main(String[] args) {
        double[] v = {1,2,3,4,5,6,7,8}; // Arrays de números reais
        double soma = 0; // Acumulador

        for(int i = 0; i < v.length; i++) { // Percorre todos os elementos
        soma += v[i]; // Soma de valores
        }

    System.out.println("A Média é: " + (soma / v.length)); // Divide pela quantidade

    }
}
