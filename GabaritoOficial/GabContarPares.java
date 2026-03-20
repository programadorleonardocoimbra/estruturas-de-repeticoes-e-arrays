package GabaritoOficial;

// 4. Contar pares
    //  Leia 10 números inteiros e conte quantos deles são pares.
        //  

        public class GabContarPares {
            public static void main(String[] args) {
                int[] v = {1,2,3,4,5,6,7,8,9,10}; // Array Exemplo
                int cont = 0; // Contador de Números pares

                for(int i = 0; i < v.length; i++){
                    if(v[i] % 2 ==0){ // verifica se é par
                        cont++; // Incrementa o contador
                
                }
            }

            System.out.println("Os Pares são: " + cont);
            
    }

}
