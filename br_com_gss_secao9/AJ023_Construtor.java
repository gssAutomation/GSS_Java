package br_com_gss_secao9;
/**
 * AJ023_Construtor
 * 
 * - O construtor de uma classe Sempre tem o mesmo nome da classe;
 * - Por padrão, a JVM - Java virtual Manchine, cria em tempo de execução uim construtor padrão, um construtor vazio
 * - 
 */
public class AJ023_Construtor {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Felicity";
        pessoa1.email = "felicity.com";
        pessoa1.ano_nascimento = 1999;

        pessoa1.imprime_informacoes();

        Pessoa pessoa2 = new Pessoa("Angelina", "angelina.com", 1999);
        pessoa2.imprime_informacoes();
    }
    
}
