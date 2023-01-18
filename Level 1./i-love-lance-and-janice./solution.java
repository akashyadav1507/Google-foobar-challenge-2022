import java.io.*;

public class Solution {

    public static String solution(String x) {
        // Your code here
        char ch;
        String solString = "";
        for (int i = 0; i < x.length(); i++) {
            ch = x.charAt(i);
 
            // Checking if the character
            // is a letter or not
            if (Character.isLetter(ch)) {
 
                // converting lowercase character
                // To reciprocal character
                if (Character.isLowerCase(ch)) {
                    ch = (char)(122 - (int)(ch) + 97);
                }
                // converting uppercase character
                // To reciprocal character
            }
            
            // display each character
            solString += ch;
        }
        return solString;
    }
    
    //Main mathod for testing 
    public static void main(String[] args) throws IOException{
        
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
 
        // String reading internally
        String x = bfn.readLine();
        System.out.println(solution(x));
    }
}
