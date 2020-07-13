package br_com_gss_secao6;
/**
 * AJ012_NumericosP2 
 * Tipos reais
 */
public class AJ012_NumericosP2 {

    public static void main(String[] args) {
        /*
        * Por padrão, os numeros reais em java são considerados double
        */
        float preco = 23.4f;
        double preco2 = 23.4;

        /**
         * Tipos não primário/primitivos
         * Usa-se pra conversão de um tipo para o outro
         */
        Float preco3 = 55.5f;
        Double preco4 = 55.5;

        System.out.println("float -> preco1" + preco);
        System.out.println("double -> preco2" + preco2);
        System.out.println("Float -> preco3" + preco3);
        System.out.println("Double -> preco4" + preco4);

    }
}