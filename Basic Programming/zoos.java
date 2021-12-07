/* IMPORTANT: Multiple classes and nested static classes are supported */


// * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int x = 0, y = 0;
        // Loop through the string and store the number of Z's and O's and at last check the given condition
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == 'z'){
                x++;
            }
            else if(input.charAt(i) == 'o'){
                y++;
            }
        }
        if((2*x) == y){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}

