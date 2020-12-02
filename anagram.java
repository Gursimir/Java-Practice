import java.util.Scanner;

public class anagram {

    static boolean isAnagram(String a, String b) {
       
        if(a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] frequency = new int[26];

        for(int i=0;i<a.length();i++){
            int index = a.charAt(i)-'a';
            frequency[index]++;
        }

        for(int i=0;i<b.length();i++){
            int index = b.charAt(i)-'a';
            frequency[index]--;
        }

        for(int i=0;i<26;i++){
            if(frequency[i] != 0)
              return false;
        }

        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
