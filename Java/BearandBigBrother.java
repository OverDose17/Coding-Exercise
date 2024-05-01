import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int count = 0;
        while(a <= b) {
            a *= 3;
            b *= 2;
            count++;
        }
        System.out.println(count);
        in.close();
    }
}
