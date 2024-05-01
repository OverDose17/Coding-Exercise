import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        int len = num.length();
        int count = 0;
        char[] temp = num.toCharArray();

        for(int i = 0; i < len; i++) {
            int temp_in = Character.getNumericValue(temp[i]);
            if( temp_in == 4 || temp_in == 7 ) {
                count++;
            }
        }

        if (count == 4 || count == 7 ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        in.close();
    }
}
