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

//Métodos
- Podemos entender os métodos como a ação realizada por um objeto da classe;
- Poidemos entender também que os métodos são comportamentos dos objetos da classe;
- Mesmos requisitos de uma função:
    - Função deve ter: tipo de retorno; Nome; Parâmetros(opcional); Retorno;
*/

public class Produto {
    String nome;
    float preco, desconto;

    //Método para aumentar o preço do projeto em 10
    void aumentar_preco(float valor){
        this.preco = this.preco + valor;
    }

    
}