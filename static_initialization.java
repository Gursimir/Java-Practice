import java.util.*;

public class static_initialization {
 
static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt(),H = scan.nextInt();
    static boolean flag = true;
    
    static {
        try{
            if(B<=0 || B>=100 || H<=0 || H>=100){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
    }
    catch(Exception e){
        System.out.println(e);
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}
}

