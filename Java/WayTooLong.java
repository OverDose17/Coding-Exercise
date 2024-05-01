import java.util.Scanner;

public class WayTooLong{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            String input = in.next();
            int length = input.length() ;

            if(length > 10){
                System.out.println(input.charAt(0) + Integer.toString(length - 2) +  input.charAt(length - 1));
            } else {
                System.out.println(input);
            }
        }
        in.close();
    }
}