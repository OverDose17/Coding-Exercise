import java.util.Scanner;

public class GeorgeandAccomodation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            int tempa = in.nextInt();
            int tempb = in.nextInt();
            if(tempa < tempb - 1)
                count++;
        }
        System.out.println(count);
        in.close();
    }
}
