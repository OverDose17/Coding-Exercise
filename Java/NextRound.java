import java.util.Scanner;
import java.util.ArrayList;

public class NextRound {
    public static void main(String[] args) {
        ArrayList<Integer> arrayli = new ArrayList<>();
        int count = 0;
        int key = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        for(int i = 1; i<=n ; i++) {
            int temp = in.nextInt();
            arrayli.add(temp);
            if(i == k){
                key = temp;
            }
        }
        for(int l : arrayli){
            if(l >= key && l != 0)
                count++;
        }
        System.out.println(count);
        in.close();
    }
}