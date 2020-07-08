/**
 * AJ018_matrizes
 * 
 * Todos os  Vetores/arrays/matrizes são multi-dimenssionais 
 * 
 * Ex:
 * int num[3];
 * num[0] = 1;
 * num[1] = 2;
 * num[2] = 3;
 * 
 * Exemplo de Matriz:
 * [linhas][colunas]
 * int num[3][3]; Como ficaria no sistema issoo
 * [linhas][colunas][valor]
 * num[0][0] = 1;
 * num[0][1] = 2;
 * num[0][2] = 3;
 * num[1][0] = 4;
 * num[1][1] = 5;
 * num[1][2] = 6;
 * num[2][0] = 7;
 * num[2][1] = 8;
 * num[2][2] = 9;
 * 
 */
public class AJ018_matrizes {

    public static void main(String[] args) {
        //Declaração
        int num[][]= new int[3][3];

        //Declarar, definir o tamanho e inicializar
        int mais_num[][] = {{1,2,3},{4,5,6},{7,8,9}};

        //Declarando a matriz informando apenas as linhas
        int matriz[][] = new int[2][];
        matriz[0] = new int[5];
        matriz[1] = new int[3];

        //Outros exemplo de declaração
        int nova_matriz[][] = { {1,2}, {4,5,6,7,8}, {9,10,11} };

        System.out.println(nova_matriz);
        System.out.println(num);
        System.out.println(mais_num);
    }
}