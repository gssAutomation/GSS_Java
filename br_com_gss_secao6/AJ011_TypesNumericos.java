package br_com_gss_secao6;
/**
 * AJ011_TypesNumericos
 * numéricos e reais
 */
public class AJ011_TypesNumericos {

    public static void main(String[] args) {
        //Tipos primários/primitivos
        long num0 = 99;
        int num1 = 4; //Inteiro
        short num2 = 4; //Inteiro(curto/baixo)
        byte num3 = 4;

        //Tipos não primários/primitivos
        Integer num4 = 98;
        Short num5 = 7;
        Byte num6 = 9;
        Long num10 = (long)99999;

        //Imprime um exemplo
        System.out.println("long -> num0: " + num0);
        System.out.println("int -> num1: " + num1);
        System.out.println("short -> num2: " + num2);
        System.out.println("byte -> num3: " + num3);
        System.out.println("Integer -> num4: " + num4);
        System.out.println("Short -> num5: " + num5);
        System.out.println("Byte -> num6: " + num6);
        System.out.println("Long -> num10: " + num10);

        //Tamanho de cada tipo 
        System.out.println("long/Long " + Long.SIZE);
        System.out.println("int/Integer " + Integer.SIZE);
        System.out.println("short/Short " + Short.SIZE);
        System.out.println("byte/Byte " + Byte.SIZE);


        //Imprime na tela os valores minimos e máximos de cada tipo
        System.out.println("Valor min int/Integer " + Integer.MIN_VALUE);
        System.out.println("Valor max int/Integer " + Integer.MAX_VALUE);

        System.out.println("Valor min short/Short " + Short.MIN_VALUE);
        System.out.println("Valor max short/Short " + Short.MAX_VALUE);

        System.out.println("Valor min byte/Byte " + Byte.MIN_VALUE);
        System.out.println("Valor max byte/Byte " + Byte.MAX_VALUE);

        System.out.println("Valor min long/Long " + Long.MIN_VALUE);
        System.out.println("Valor max long/Long " + Long.MAX_VALUE);
    }
}