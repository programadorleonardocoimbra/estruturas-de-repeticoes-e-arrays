package GabaritoOficial;

// 8. Soma dos índices pares
      //  Leia 10 números e some apenas os valores que estão em índices pares (0, 2, 4...).
          //  Ideia: pular posições usando i += 2.

public class GabSomaIndicesPares {
    public static void main(String[] args) {
       int[] v = {1,2,3,4,5,6,7,8,9,10}; // Array
       int soma = 0; // Acumulador

    for(int i = 0; i < v.length; i+=2){ // Incrementa de 2 em 2
        soma += v[i]; // Soma apenas índices pares
}

    System.out.println("Soma: " + soma); // Resultado         


    }
}
