/**
 * AJ019_matrizesPart2
 */
public class AJ019_matrizesPart2 {

    public static void main(String[] args) {
        int num[][] = new int[3][3];
        num[0][0] = 1;
        num[0][1] = 2;
        num[0][2] = 3;
        num[1][0] = 4;
        num[1][1] = 5;
        num[1][2] = 6;
        num[2][0] = 7;
        num[2][1] = 8;
        num[2][2] = 9;

        //Imprimindo especificamente a linha e coluna
        System.out.println(num[1][2]);

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.println("Numeros [ " + i + " ] " + " [ " + j + " ] " + " = " + num[i][j]);
            }
        }


    }
}