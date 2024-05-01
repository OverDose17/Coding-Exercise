import java.util.Scanner;

public class ImsoniaCure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int k = in.nextInt();
        int l = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int d = in.nextInt();
        for(int i = 1; i <= d; i++) {
            if(i % k == 0) {
                count++;
            }
            else if(i % l == 0) {
                count++;
            }
            else if(i % m == 0) {
                count++;
            }
            else if(i % n == 0) {
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
