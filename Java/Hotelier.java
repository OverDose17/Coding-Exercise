//import java.util.ArrayList;
import java.util.Scanner;

public class Hotelier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] room = new int[10];
        int n = in.nextInt();
        String tempEvent = in.next();
        char[] event = tempEvent.toCharArray();
        for(int i = 0; i < n; i++) {
            char key = event[i];
            if(Character.isAlphabetic(key)){
                if(key == 'L') {
                    for(int m = 0; m < 10; m++ ) {
                        if(room[m] == 0) {
                            room[m] = 1;   
                            break;
                        }
                    }
                }
                else {
                    for(int m = 9; m >= 0; m-- ) {
                        if(room[m] == 0) {
                            room[m] = 1;
                            break;
                        }        
                    }
                }
            }
            else if(Character.isDigit(key)) {
                for(int m = 0; m <= 10; m++ ) {
                    if(m == Character.getNumericValue(key)) {
                        room[m] = 0; 
                        break;
                    }
                }
            }
        }
        for (int z : room) {
            System.out.print(z);
        }
        in.close();
    }
}