package br_com_gss_secao6;
/**
 * AJ013_Alfanumericos
 * Caracteres e strings
 */
public class AJ013_Alfanumericos {

    public static void main(String[] args) {
        //Tipos primitivos
        char letra  = 'a';
        char letra2 = 97;  //97 em decimal == 'a'
        System.out.println("Letra2 " + letra2);

        letra2 = (char)(letra2 + 1); //cast

        System.out.println("Letra " + letra);
        System.out.println("Letra2 " + letra2);

        //Tipos não primitivos
        Character letra3 = 'A';
        String nome = "GSS_Automation";

        System.out.println("Letra3" + letra3);

        //Imprime os dados do tamanho do Character
        System.out.println("char/Chracter " + Character.SIZE + " bits");
        System.out.println("char/Char min " + Character.MIN_VALUE);
        System.out.println("char/Char max " + Character.MAX_VALUE);

        System.out.println("Nome da empresa: " + nome);
        //Tamanho da String
        System.out.println("Tamanho da String: " + nome.length());
        //Tamanho do caractere 
        System.out.println("String " + (Character.SIZE * nome.length() + " bits"));

    }
}