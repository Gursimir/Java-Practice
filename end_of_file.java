import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class end_of_file {

    public static void main(String[] args) {
       Scanner scan = new Scanner
       (System.in);
       int count = 0;
        while(scan.hasNext()){
            String s = scan.nextLine();
            count ++ ;
            System.out.printf("%d %s",count,s);
            System.out.println();
        }
        scan.close();
    }
}
