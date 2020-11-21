import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class tag_content_extractor {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
            String tagMatch = "(<)";
            if (line.matches(tagMatch)) {
                System.out.println(s);
            }
            else{
                System.out.println("None");
            }
            testCases--;
            in.close();
		}
	}
}



