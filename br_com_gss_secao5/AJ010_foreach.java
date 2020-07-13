package br_com_gss_secao5;
/*
* For each
*/

public class AJ010_foreach {
    public static void main(String[] args) {
        String nome = "Guilherme";

        for (char letra : nome.toCharArray()) {
            System.out.println(letra);
            //System.out.print(letra);
        }
    }
}