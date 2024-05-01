import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int temp = 0;
        for(int i = 0; i < n; i++) {
            count -= in.nextInt();
            count += in.nextInt();
            if(temp < count)
                temp = count;
        }
        System.out.println(temp);
        in.close();
    }
}