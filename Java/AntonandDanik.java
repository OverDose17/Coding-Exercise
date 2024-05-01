import java.util.Scanner;

public class AntonandDanik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        char[] temp = str.toCharArray();
        int countA = 0;
        int countD = 0;
        for(int i = 0; i < n; i++) {
            if(temp[i] == 'A')
                countA++;
            else
                countD++;
        }
        if(countA > countD)
            System.out.println("Anton");
        else if(countD > countA)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
        in.close();
    }
}