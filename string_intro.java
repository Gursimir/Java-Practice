import java.io.*;
import java.util.*;

public class string_intro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        
        String C = A+B;
        System.out.println(C.length());

        int result = A.compareTo(B);

        if(result>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        String firstLetterA = A.substring(0, 1).toUpperCase();
        String remainingletterA = A.substring(1, A.length());
        A = firstLetterA+remainingletterA;

        String firstLetterB = B.substring(0, 1).toUpperCase();
        String remainingletterB = B.substring(1, B.length());
        B = firstLetterB+remainingletterB;

        System.out.println(A+" "+B);
        
    }
}



