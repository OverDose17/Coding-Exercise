
import java.util.ArrayList;
import java.util.Scanner;

public class ThreeIndicies {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int z = 0 ; z < n ; z++) {
            int size = in.nextInt();
            
            for(int y = 0; y < size; y++) {
                l1.add(in.nextInt());
            }
            for(int y = 0; y <= size - 3; y++) {
                int temp = l1.get(y);
                int temp1 = l1.get(y + 1);
                int temp2 = l1.get(y + 2);
                if( temp < temp1 && temp1 > temp2) {
                    System.out.println("yES\n" + (y + 1) + " " + (y + 2) + " " + (y + 3) );
                    break;
                }
                else if( y == size - 3){
                    System.out.println("NO"); 
                    break;
                }
            }
            l1.clear();
        }
        in.close();
    }
} 