/**
 * AJ014_Booleanos
 */
public class AJ014_Booleanos {

    public static void main(String[] args) {
        //Tipos primitivos
        boolean verdadeiro = true;
        boolean falso = false;

        //Tipos não primitivos
        Boolean v = true;
        Boolean f = false;

        System.out.println("Verdadeiro: " + verdadeiro);
        System.out.println("Falso: " + falso);
        System.out.println("V verdadeiro: " + v);
        System.out.println("F falso: " + f);

        System.out.println("boolean/Boolean == 0 or 1" ); //Verdadeiro ou falso

        if (verdadeiro) {
            System.out.println("É verdadeiro");
        }else{
            System.out.println("Não é verdadeiro");
        }
    }
}