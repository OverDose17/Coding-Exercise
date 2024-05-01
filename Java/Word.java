import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in. next();
        char[] temp = s.toCharArray();
        int up = 0;
        int lo = 0;
        for (char c : temp) {
            if(Character.isUpperCase(c))
                up++;
            else 
                lo++;
        }
        if(up > lo)
            System.out.println(s.toUpperCase());
        else if (lo > up || lo == up)
            System.out.println(s.toLowerCase());
        in.close();
    }
}