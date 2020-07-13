package br_com_gss_secao7;
/**
 * AJ017_vetoresPart2 
 * 
 * Declaração de vetor, imprimindo em outras posições e mostrando na tela 
 */
public class AJ017_vetoresPart2 {

    public static void main(String[] args) {
        int numeros[] = new int[10];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 3;
        }

        System.out.println(numeros[0]);//Primeiro elemento 
        System.out.println(numeros[9]);//Segundo elemento

        for(int k = 0; k < numeros.length; k++){
            numeros[k] = (int)Math.round(Math.random() * 10);
        }

        System.out.println(numeros[0]);//Primeiro elemento 
        System.out.println(numeros[9]);//Segundo elemento

        //Bilbioteca Math.ramdom gera um numero entre 0 e 1
        System.out.println(Math.random());

        System.out.println(Math.random() * 10);

        System.out.println(Math.round(Math.random() * 10));
        
        
    }
}