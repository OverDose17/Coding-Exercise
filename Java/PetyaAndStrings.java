import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] str1 = in.next().toLowerCase().toCharArray();
        char[] str2 = in.next().toLowerCase().toCharArray();
        int len = str1.length;
        for(int i = 0; i < len; i++) {
            if(str1[i] < str2[i]){
                System.out.println("-1");
                return;
            }
            else if(str2[i] < str1[i]) {
                System.out.println("1");
                return;
            }
        }
        System.out.println("0");
        in.close();
    }
}