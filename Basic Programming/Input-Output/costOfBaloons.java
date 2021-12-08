/* IMPORTANT: Multiple classes and nested static classes are supported */


// * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import for Scanner and other utility classes
import java.util.*;
import java.lang.*;


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
        int testCases = scan.nextInt();
        for(int i = 0; i < testCases; i++){
            int green = scan.nextInt();
            int purple = scan.nextInt();
            int n = scan.nextInt();
            int[][] status = new int[n][2];
            for(int j = 0; j < n; j++){
                for(int k = 0; k < 2; k++){
                    status[j][k] = scan.nextInt();
                }
            }
            int minCost = minimumCost(status, n, green, purple);
            System.out.println(minCost);
        }

    }
    public static int minimumCost(int[][] status, int n, int green, int purple){
        int firstProb = 0, secondProb = 0, minCost = 0;
        for(int i = 0; i < n; i++){
            if(status[i][0] == 1){
                firstProb++;
            }
            if(status[i][1] == 1){
                secondProb++;
            }
        }
        /*  Here I am multiplying minimum number of people solved a problem with maximum cost among the two pf baloons and vice versa so we get the minimum cost 
        */
        minCost += (Math.min(firstProb, secondProb) * Math.max(green, purple));
        minCost += (Math.max(firstProb, secondProb) * Math.min(green, purple));
        return minCost;
    }
}

