import java.util.Scanner;

//do While
public class AJ008_do_while {
    public static void main(String[] args) {
        int idade = 1;
        String nome;

        //Recebe dados do usuário via teclado
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.println("Informe sua idade: ");
            //Bug: :idade = teclado.nextInt();
            idade = Integer.parseInt(teclado.nextLine());

            System.out.println(nome + " tem " + idade + " anos ");
            
        }while (idade > 0);

        teclado.close();
    }
}