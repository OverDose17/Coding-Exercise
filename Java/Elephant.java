import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int count = 0;
        
        while( x > 0) {
            if( x >= 5) {
                count += x / 5;
                x %= 5;
            }
            else if( x >= 4) {
                count += x / 4;
                x %= 4;
            }
            else if(x >= 3) {
                count += x / 3;
                x %= 3;
            }
            else if( x >= 2) {
                count += x / 2;
                x %= 2;
            }
            else { 
                count++; 
                x--;      
            }
        }
        System.out.println(count);
        in.close();
    }
}
