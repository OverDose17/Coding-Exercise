import java.util.Scanner;

public class Team   {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            int temp = 0;
            for(int j = 0; j < 3; j++) {
                if(in.nextInt() == 1) {
                    temp++;
                }
            }
            if(temp >= 2)
                count++;
        }
        System.out.println(count);
        in.close();
    }
}