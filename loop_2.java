import java.util.*;

class Loop_2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        for(int i=0;i<q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int p = 1;

            for(int j=0;j<n;j++){
                a = a + p*b;
                System.out.printf("%d ",a);
                /*x<<N shifts bits of x left by distance N; fills with  0 bits on right side*/
                p = p << 1 ;
            }
            System.out.println();
        }
        in.close();

    }
}
