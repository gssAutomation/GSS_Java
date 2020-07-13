package br_com_gss_secao9;
/*
//Aula de classes

//Classes
- o nome das classes inicia com letra Maiuscula;
- o nome não deve conter: Acentuação, caracteres especiais, espaço;
- Nas classes java, não existe a implementação da função main;
- Toda classe Java possui a seguinte forma;
- o nome da classe deve ser o mesmo nome do arquivo java;
- public class NomeDaClasse{
    exemplo
}
//Atributos
- São as características da classe/molde/modelo de dados;
- Podemos entender atributos como variáveis da classe;
- Uma outra forma de nomenclatura para os atributos são estados;
- Atributos são nomeados em letras minusculas, sem espaço, sem caracteres especiais, sem acentuação;
*/

public class Pessoa {
    String nome, email;
    int ano_nascimento;

    public Pessoa() {
        //Construtor
        /**
         * - Sempre um construtor vazio recebe esse seguinte formato
         */
    }
    //Construtor com parâmetro--->
    public Pessoa(String nome, String email, int ano_nascimento) {
        //This == Este objeto;
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;
    }

    void imprime_informacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Ano de nascimento: " + this.ano_nascimento);
    }

    
}