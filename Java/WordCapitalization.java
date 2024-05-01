import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] tmp = str.toCharArray();
        tmp[0] = Character.toUpperCase(tmp[0]);
        System.out.println(tmp);
        in.close();
    }
}
