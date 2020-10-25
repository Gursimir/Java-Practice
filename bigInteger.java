import java.math.BigInteger;
import java.util.*;

public class bigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger a ,b,sum;
        a = sc.nextBigInteger();
        b = sc.nextBigInteger();
        sc.close();

        sum = a.add(b);
        BigInteger multipal = a.multiply(b);

        System.out.println(sum);
        System.out.println(multipal);

    }
}
