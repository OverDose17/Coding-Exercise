import java.util.ArrayList;
import java.util.Scanner;

public class BoyorGirl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        
        char[] tmp = str.toCharArray();
        ArrayList<Character> list1 = new ArrayList<>();
        for(int i = 0 ; i < tmp.length ; i++) {
            if(!list1.contains(tmp[i])){
                list1.add(tmp[i]);
            }
        }
        int count = list1.size();
        if(count % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else {
            System.out.println("IGNORE HIM!");
        }
        in.close();
    }
}
