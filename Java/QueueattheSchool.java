import java.util.Scanner;

public class QueueattheSchool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        String queue = in.next();
        char[] queue_temp = queue.toCharArray();
        for(int j = 0; j < t; j++) {
            for(int i = 1; i < n; i++) {
                if(queue_temp[i] == 'G' && queue_temp[i-1] == 'B' ){
                    char temp = queue_temp[i-1];
                    queue_temp[i-1] = queue_temp[i];
                    queue_temp[i] = temp;
                    i++;
                }
            }
        }
        queue = String.valueOf(queue_temp);
        System.out.println(queue);

        in.close();
    }
}
