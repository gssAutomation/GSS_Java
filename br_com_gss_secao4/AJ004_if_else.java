package br_com_gss_secao4;

public class AJ004_if_else {

    public static void main(String[] args) {
        //Declarando uma variavel
        int numero = 9;
        
        if (numero > 5) {
            System.out.println("Sim " + numero + " maior");
        }else if(numero == 5){
            System.out.println("Talvez seja igual");
        } else {
            System.out.println("Nao é mesmo");
        }

    }
    
}