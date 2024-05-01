import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        char[] temp1 = str1.toCharArray();
        char[] temp2 = str2.toCharArray();
        int len = str1.length();
        for(int i = 0; i < len; i++) {
            if(temp1[len-1-i] != temp2[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        in.close();
    }
}
