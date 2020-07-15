package br_com_gss_secao12;

public class Professor extends Pessoa {
    private String matricula;

    public Professor(String nome, int ano_nascimento, String matricula) {
        super(nome, ano_nascimento);
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String toString(){
        return super.toString() + "\nMatricula: " + this.matricula;
    }
}