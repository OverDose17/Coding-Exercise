import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        year++;
        for(  ;  ; year++) {
            int a = year / 1000;
            int b = (year % 1000) / 100;
            int c = (year % 100) / 10;
            int d = year % 10;
            if( a != b && a != c && a !=d && b != c && b != d && c != d){
                System.out.println(year);
                return;
            }
        }
    }
}
