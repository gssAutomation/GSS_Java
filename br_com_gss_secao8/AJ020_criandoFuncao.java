package br_com_gss_secao8;
import java.util.Scanner;

/**
 * AJ020_criandoFuncao
 * 
 * Faça um programa, que receba diversos nomes de frutas
 * e no fina imprima essas frutas em order contrári.
 * O programa solicita ao usuário quantas frutas ele quer informar.
 * - Informe quantas frutas ele quer cadastrar
 * - informe o nome da fruta
 * - imprime ao contrário
 */

public class AJ020_criandoFuncao {
    //Declaração do vetor
    static String frutas[];
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //Definindo variáveis
        int qtd;
        
        System.out.println("Informe quantas frutas quer cadastrar: ");
        qtd = Integer.parseInt(teclado.nextLine());

        cadastrar_dados(qtd);   //Chamando a função de cadastramento de dados
        mostrar_dados(qtd);     //Chamando a função para mostrar os dados

        teclado.close();
    }
    /* Função deve ter: tipo de retorno; Nome; Parâmetros; Retorno; */
    static void cadastrar_dados(int quanti) {
        frutas = new String[quanti];
        for(int i = 0; i < quanti; i++){//i++ -> i = i + 1
            System.out.println("Informe a " + (i +1) + " fruta: ");
            frutas[i] = teclado.nextLine();
        }
    }
    static void mostrar_dados(int quanti) {
        for( int i = (quanti - 1); i >=0; i--){//i-- -> i = i -1
            System.out.println(frutas[i]);
        }
    }
}