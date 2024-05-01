import java.util.Scanner;
import java.lang.Math;

public class BeautifulMatrix {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matric = new int [5][5];
        int keyi = 0;
        int keyj = 0;
        for(int i = 0; i < 5; i++) { // input matrix
            for(int j = 0; j < 5; j++) {
                int temp = in.nextInt();
                matric[i][j] = temp;
                if(temp == 1) {
                    keyi = Math.abs(3 - (i + 1));
                    keyj = Math.abs(3 - (j + 1));
                }
            }
        }
        System.out.println(keyi + keyj);

        in.close();
    }
}