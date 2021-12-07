/* IMPORTANT: Multiple classes and nested static classes are supported */


 //* uncomment this if you want to read input.
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
            // Take input and find the minimum value in first array !!
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] a = new int[length];
        int[] b = new int[length];
        int index = 0, steps = 0;
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < length; i++){
            a[i] = scan.nextInt();
            if(a[i] < minValue){
                minValue = a[i];
            }
        }
        for(int i = 0; i < length; i++){
            b[i] = scan.nextInt();
        }
            // Run two while loops and keep reducing the values to the minimum value
            // If the value goes less than zero, return -1 as all elements cannot be same in the array
        while(index < length){
            // Keep doing the given action until the value is greater than minimum value
            while(a[index] > minValue){
                a[index] -= b[index];
                steps++;
            }
            // Now if obtained value is less than minValue, assign that value as minValue and start the loop again from index=0
            if(a[index] < minValue){
                minValue = a[index];
                index = 0;
            }
            // If the value is less than zero, then it is impossible so set steps to -1 and break the loop
            else if(a[index] < 0){
                steps = -1;
                break;
            }
            // Otherwise increrase index and continue with the loop
            else{
                index++;
            }
        }
        System.out.println(steps);
    }
}

