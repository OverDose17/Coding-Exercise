import java.util.Scanner;

public class VanyaandFence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int width = 0;
        for(int i = 0; i < n; i++ ) {
            int temp = in.nextInt();
            if(temp > h)
                width +=2;
            else 
                width++;
        }
        System.out.println(width);
        in.close();
    }   
}
