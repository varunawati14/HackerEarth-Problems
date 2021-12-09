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
        /*  I have used long Data Type as the constraints go till (10**9).
        */
        long dist = scan.nextInt();
        long oc = scan.nextInt();
        long of = scan.nextInt();
        long od = scan.nextInt();
        long onlineCost = 0, classicCost = 0;
        if(dist > of){
            onlineCost += oc;
            long diff = dist - of;
            onlineCost += (od * diff);
        }
        else{
            onlineCost += oc;
        }
        long cs = scan.nextInt();
        long cb = scan.nextInt();
        long cm = scan.nextInt();
        long cd = scan.nextInt();
        classicCost = cb + ((dist/cs)* cm) + (dist * cd);
        /*  First calculate the cost of each online taxi and classic taxi according to the given condition and compare them and select the minimum among them. 
        */
        if(onlineCost <= classicCost){
            System.out.println("Online Taxi");
        }
        else{
            System.out.println("Classic Taxi");
        }

    }
}

