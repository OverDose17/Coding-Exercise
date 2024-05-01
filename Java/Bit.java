import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = 0;
        for(int i = 0; i < n; i++) {
            String temp = in.next();
            if(temp.contains("+")) {
                total++;
            }
            else {
                total--;
            }
        }
        System.out.println(total);
        in.close();
    }
}