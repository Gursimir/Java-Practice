import java.util.*;

public class string_tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
         String regex = "[ !,?._'@]+";
         String[] str = s.trim().split(regex);
        
         if(s.trim().length()==0||s.trim().length()>400000){
            System.out.println(0);
        }

        System.out.println(str.length);
        for(int i=0;i<str.length; i++) {
            System.out.println(str[i]);
        }
        
        scan.close();
    }
}

