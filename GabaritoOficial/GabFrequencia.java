package GabaritoOficial;

//  10. Frequência de número 
    //  Leia 10 números e depois um número qualquer. Mostre quantas vezes ele aparece no array.
        //  Ideia: contar quantas vezes um valor aparece.

public class GabFrequencia {
    public static void main(String[] args) {
        int[] v = {1,2,3,2,4,2,5,2,6,2}; // Array
        int num = 2; // Número que queremos contar
        int cont = 0; // Contador

    for(int i = 0; i < v.length; i++){ // Percorre o array
    if(v[i] == num){ // Verifica se é igual ao número
        cont++; // Incrementa o contador
    }
}

    System.out.println("Frequência: " + cont); // Resultado


    }
}
