package br_com_gss_secao9;
/**
 * AJ022_ObjetosClass
 */
public class AJ022_ObjetosClass {

    public static void main(String[] args) {
        //Delacração e /instanciando/iniciação do objeto;
        //p1 -> instancia do objeto
        Produto p0;
        Produto p1 = new Produto(); //Construtor

        p1.nome = "Notebook";
        p1.preco = 2500f;
        p1.desconto = 15.0f;

        System.out.println("--------Produto--------");
        System.out.println(p1.nome);
        System.out.println("R$ " + p1.preco);
        System.out.println(p1.desconto + " %");

        p0 = new Produto(); //Construtor
        p0.nome = "Caneta Bic";
        p0.preco = 10.0f;
        p0.desconto = 10.0f;

        System.out.println("--------Produto--------");
        System.out.println(p0.nome);
        System.out.println("R$ " + p0.preco);
        System.out.println(p0.desconto + " %");

        Pessoa pessoa1 = new Pessoa(); //Construtor
        pessoa1.nome = "Angelina Jolie";
        pessoa1.email = "angelina.com";
        pessoa1.ano_nascimento = 1990;

        System.out.println();
        System.out.println("--------Pessoa--------");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("E-mail: " + pessoa1.email);
        System.out.println("Ano de Nascimento " + pessoa1.ano_nascimento);
    } 
}