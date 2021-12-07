/* IMPORTANT: Multiple classes and nested static classes are supported */


// * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        
        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
        }

        
        // Write your code here
        // ans = 
        String ans = "";
            /* If a number is to be divisible by 10, the digit at one's place has to be zero. Here we are forming the number taking the digit at one's place of all the numbers in the array. So if the digit at one's place of the number at the last index in the array is zero the number is divisible by 10 
            */
        int lastDigit = data[N-1] % 10;
        if(lastDigit == 0){
            ans = "Yes";
        } 
        else{
            ans = "No";
        }
        
        
        System.out.println(ans);
    }
}
