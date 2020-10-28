import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
         String[] str = s.split(" ");
        int l = str.length;

        System.out.println("l");
        for(int i=0;i<l;i++){
            System.out.println(str[i]);
        }
        
        scan.close();
    }
}

