package GabaritoOficial;

// 6. Buscar número
     //  Leia 10 números e depois um número específico. Verifique se ele está no array.
        //  Ideia: busca linear simples.

public class GabBuscarNumero {
    public static void main(String[] args) {
        int[] v = {1,2,3,4,5,6,7,8,9,10}; // Array
        int buscado = 15; // Número que queremos encontrar
        boolean achou = false; // Controle de busca 
        
    for(int i = 0; i < v.length; i++) { // Percorre o array
        if(v[i] == buscado) { // Verifica se encontrou
            achou = true; // Marca como encontrado
                break; // Interrompe o loop
        }


    }

    System.out.println(achou ? "Encontrado" : "Não Encontrado"); // Resultado

    }
    
}
