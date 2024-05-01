import java.util.Scanner;

public class StonesontheTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        char[] tmp = str.toCharArray();
        int count = 0;
        for(int i = 0; i< n - 1; i++) {
            if(tmp[i] == tmp[i+1]) {
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
