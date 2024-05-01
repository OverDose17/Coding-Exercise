import java.util.Scanner;

public class WrongSubtraction {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int num = in.nextInt();
       int n = in.nextInt();
       for(int i = 0; i < n; i++) {
           if(num % 10 == 0) {
               num /= 10;
           }
           else{
               num--;
           }
       } 
       System.out.println(num);
       in.close();
   } 
}
