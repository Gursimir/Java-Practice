import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class subset_comparicion {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
/* finding all the possible substrings of the string 's' with length 'k' and storing them into the vector 'str' we can also use ArrayList too */
        Vector<String> str = new Vector<String>();
    
        for (int i=0;i<s.length();i++){
            for(int j=1;j<s.length();j++){
                if(s.substring(i, j).length() == k){
                    str.add(s.substring(i, j));
                }
            }
        }
        int result;
        for (int i=0;i<str.size();i++){
            for(int j=1;j<str.size();j++){
                result = str.get(i).compareTo(str.get(j));
                
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
