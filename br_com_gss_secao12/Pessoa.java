package br_com_gss_secao12;

public class Pessoa {
    private String nome;
    private int ano_nascimento;

    public Pessoa(String nome, int ano_nascimento) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
    }

    //Getters
    public String getNome(){
        return this.nome;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getters
    public int getAnoNascimento() {
        return this.ano_nascimento;
    }

    //Setters
    public void setAnoNascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }
}