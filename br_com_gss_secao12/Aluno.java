package br_com_gss_secao12;

public class Aluno {
    private String nome;
    private int ano_nascimento; 
    private String ra;

    public Aluno (String nome, int ano_nascimento, String ra) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.ra = ra;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAnoNascimento(int ano_nascimento){
        return this.ano_nascimento;
    }

    public void setAnoNascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public String getRa(){
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
}