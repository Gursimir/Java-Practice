import java.util.*;

public class palindrom {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();

        String reverse ="";
        for (int i =A.length()-1;i>=0;i--){
            reverse = reverse+A.charAt(i); 
        }

        if (reverse.equalsIgnoreCase(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}



