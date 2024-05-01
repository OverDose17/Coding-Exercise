import java.util.Scanner;

public class SoldierandBananas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        int temp = k;

        for(int i = 2; i <= w; i++) 
            k += i * temp; 

        if(n >= k) 
            System.out.println(0);
        else 
            System.out.println(k - n);
            
        in.close();
    }
}
