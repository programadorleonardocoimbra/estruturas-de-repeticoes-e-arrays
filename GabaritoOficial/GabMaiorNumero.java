package GabaritoOficial;

// 2. Maior número
     //  Leia 10 números e informe qual é o maior valor armazenado no array.
         //  Ideia: comparar elemento por elemento para encontrar o maior.

public class GabMaiorNumero {
    public static void main(String[] args) {
        int[] v= {1, 3, 2, 1, 9, 6, 7, 4, 6, 0}; //Array já preenchido
        int maior = v[1]; // Assume o primeiro como ,maior inicialmente

        for(int i = 1; i < v.length; i++) { // começa do segundo elemento
            if(v[i] > maior) { // compara com o maior atual
                maior = v[i]; // Atualiza se encontrar um maior
                
                
        System.out.println("Maior é: " + maior); // Imprime o resultado do maior valor
                
            }    
        }

    }
}
