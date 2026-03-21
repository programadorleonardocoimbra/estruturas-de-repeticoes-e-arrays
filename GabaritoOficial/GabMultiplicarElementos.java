package GabaritoOficial;

//  7. Multiplicar elementos
      //Leia 5 números e multiplique todos por 2, mostrando o novo array.
           //  Ideia: modificar diretamente os valores do array.    

public class GabMultiplicarElementos {
    public static void main(String[] args) {
       int[] v = {1,2,3,4,5}; // Array inicial

    for(int i = 0; i < v.length; i++){ // Percorre o array
        v[i] *= 2; // Multiplica cada elemento por 2
            System.out.print(v[i] + " "); // Mostra o novo valor
} 



    }
}
