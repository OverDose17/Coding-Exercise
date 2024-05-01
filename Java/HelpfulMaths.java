import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] tmp = str.toCharArray();
        for( int i = 0; i < tmp.length; i++ ){
            if(Character.isDigit(tmp[i])) {
                list1.add(Character.getNumericValue(tmp[i]));
            }
        }
        Collections.sort(list1);
        int len = list1.size();
        for(int i = 0; i < len; i++) {
            System.out.print(list1.get(i));
            if(i == len - 1){
                break;
            }
            System.out.print("+");
        }
        in.close();
    }
}
