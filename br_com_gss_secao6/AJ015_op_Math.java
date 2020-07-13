package br_com_gss_secao6;
/**
 * AJ015_op_Math
 * Operações matemáticas 
 */
public class AJ015_op_Math {

    public static void main(String[] args) {
        int num1 = 5, num2 = 10, mult, divi, soma, sub;
        float resto;

        //Soma 
        soma = num1 + num2;
        System.out.println("Soma " + num1 + " + " + num2 + " = " + soma);

        //Subtração
        sub = num1 - num2;
        System.out.println("Subtração " + num1 + " - " + num2 + " = " + sub);

        //Multiplicação
        mult = num1 * num2;
        System.out.println("Multiplicação " + num1 + " * " + num2 + " = " + mult);

        //Divisão
        divi = num1 / num2;
        System.out.println("Divisão " + num1 + " / " + num2 + " = " + divi);

        //Resto
        resto = num1 % 2;
        System.out.println("Resto da divisão % " + num1 + " = " + resto);
        resto = num2 % 2;
        System.out.println("Resto da divisão % " + num2 + " = " + resto);

    }
}