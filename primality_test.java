import java.math.BigInteger;
import java.util.Scanner;

public class primality_test {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger num = scanner.nextBigInteger();
        boolean result = num.isProbablePrime(1);
        if(result == true){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        scanner.close();
    }
}
