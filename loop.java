
import java.util.*;


public class loop {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1;i<=10;i++){
            int x;
            x=N*i;
            System.out.printf("%d x %d = %d",N,i,x);
            System.out.println();
        }

        scanner.close();
    }
}
