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
            /* Two houses cannot be consecutive as it will violate the condition. And we replace all the '.' with 'B' so that each person can only go one grid that is their house as they have mentioned we should place maximum possible fences.
            */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        // Do a scan.nextLine() before taking the string input
        scan.nextLine();
        String grid = scan.nextLine();
        StringBuilder replacedGrid = new StringBuilder(grid);
        // I have used StringBuilder class to easily replace '.' with 'B'
        for(int i = 0; i < grid.length()-1; i++){
            if(grid.charAt(i) == 'H' && grid.charAt(i+1) != '.'){
                System.out.println("NO");
                return;
            }
            if(grid.charAt(i) == '.'){
                replacedGrid.setCharAt(i, 'B');
            }
        }
        /* If the last character is '.', the above loop won't replace so we check only for the last character and if it is '.', we replace it with 'B'
        */
        if(grid.charAt(grid.length()-1) == '.'){
            replacedGrid.setCharAt(grid.length()-1, 'B');
        }
        System.out.println("YES");
        System.out.println(replacedGrid);
    }
}

