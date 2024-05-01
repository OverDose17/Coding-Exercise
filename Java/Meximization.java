import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Meximization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        ArrayList<Integer> listC = new ArrayList<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            int m = in.nextInt();
            for (int l = 0; l < m; l++ ) {
                listA.add(in.nextInt());
            }
            Collections.sort(listA);
            listC.add(listA.get(0));
            for (int k = 1; k < listA.size(); k++) { // 0 is already sorted dont need to check
                int temp1 = listA.get(k);
                int temp2 = listA.get(k-1);
                if(temp1 == temp2) {
                    listB.add(temp1);
                }
                else {
                    listC.add(temp1);
                }
            }
            listC.addAll(listB);
            for (Integer z : listC) {
                System.out.print(z + " ");
            }
            listA.clear();
            listB.clear();
            listC.clear();
        }
        in.close();
    }
}
