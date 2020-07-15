package br_com_gss_secao12;


/**
 * AJ028_heranca
 * 
 * Benefícios da Herança
 * - Evita a repetição de código;
 * - Facilita a manutenção do programa
 */
public class AJ028_heranca {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Guilherme", 1997);

        System.out.println(p1.getNome());

        Aluno a1 = new Aluno("Guilherme", 1997, "8904");

        System.out.println(a1.getNome());
    }
}