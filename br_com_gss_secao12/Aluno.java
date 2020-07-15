package br_com_gss_secao12;

/**
 * AJ028_heranca
 * 
 * Benefícios da Herança:
 * - Evita a repetição de código;
 * - Facilita a manutenção do programa;
 * 
 * Quanddo uma classe herda de outra classe ela ganha:
 * - Todos os atributos e métodos da classe herdada;
 */

public class Aluno extends Pessoa{
    
    private String ra;

    public Aluno (String nome, int ano_nascimento, String ra) {
        super(nome, ano_nascimento);
        this.ra = ra;
    }

    
    public String getRa(){
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
    public String toString(){
        return super.toString() + "\nR.A" + this.ra;
    }
}