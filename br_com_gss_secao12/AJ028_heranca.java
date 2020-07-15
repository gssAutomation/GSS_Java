package br_com_gss_secao12;


/**
 * AJ028_heranca e polimorfismo
 * 
 * Benefícios da Herança:
 * - Evita a repetição de código;
 * - Facilita a manutenção do programa;
 * 
 * Quanddo uma classe herda de outra classe
 * ela ganha:
 * - Todos os atributos e métodos da classe herdada;
 * 
 * Classes: 
 * Classe base, classe mãe, classe pai, 
 * super classe e classe genérica;
 * 
 */
public class AJ028_heranca {

    public static void main(final String[] args) {

        final Pessoa p1 = new Pessoa("Pessoa Guilherme", 1997);

        System.out.println(p1);
        System.out.println("\n");

        //System.out.println(p1.getNome());
        //System.out.println(p1.getAnoNascimento());

        final Aluno a1 = new Aluno("Aluno Guilherme", 1997, "8904");
        System.out.println(a1);
        System.out.println("\n");

        //System.out.println(a1.getNome());
        //System.out.println(a1.getAnoNascimento());
        //System.out.println(a1.getRa());

        final Professor P1 = new Professor("Professor Guilherme", 1990, "52000");
        System.out.println(P1);
        System.out.println("\n");

        //System.out.println(P1.getNome());
        //System.out.println(P1.getAnoNascimento());
        //System.out.println(P1.getMatricula());

        //System.out.println(a1.toString());
        
    }
}