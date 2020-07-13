package br_com_gss_secao11;

/**
 * AJ025
 * 
 * Getters e Setters 
 * - Getters
 *      - é um metodo público, que serve para consultar dados;
 *      - A nomeclatura desses métodos é get_nome_do_atributo()
 * 
 */
public class AJ025{
    public static void main(String[] args) {
        Cliente guilherme = new Cliente("Guilherme", "Rua tal");
        Cliente Maria = new Cliente("Maria", "Rua tal");

        Conta conta_guilherme = new Conta(1, 100.0f, 300.0f, guilherme);

        Conta conta_Maria = new Conta(2, 200.0f, 300.0f, Maria);

        System.out.println("Saldo Guilherme " + conta_guilherme.getSaldo());

        System.out.println("Saldo Maria " + conta_Maria.getSaldo());

        conta_guilherme.sacar(300);
        System.out.println("Saldo Guilherme (DEPOIS do saque): " + conta_guilherme.getSaldo());

    }
    
}