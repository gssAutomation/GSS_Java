/**
 * AJ005 - Operador ternário
 */
public class AJ005 {

    public static void main(String[] args) {
        int valor = 3, numero;
        /*
        if (valor > 0) {
            numero = valor;
        } else {
            numero =7;
        }*/

        //Operador ternário
        numero = (valor > 0) ? valor : 7;
        
        System.out.println(numero);
    }
}