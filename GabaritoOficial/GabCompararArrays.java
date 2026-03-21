package GabaritoOficial;

//  9. Comparar arrays
      //  Leia dois arrays de 5 posições e verifique se eles são iguais.
          //  Ideia: comparar elemento a elemento.
          
public class GabCompararArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5}; // Primeiro array
        int[] b = {1,2,3,4,5}; // Segundo array
        boolean iguais = true; // Assume que são iguais

    for(int i = 0; i < a.length; i++){ // Percorre ambos
        if(a[i] != b[i]){ // Compara posição por posição
            iguais = false; // Se diferente, marca como falso
                break; // Para o loop
    }
}

    System.out.println(iguais ? "Iguais" : "Diferentes"); // Resultado



    }
}
