/* IMPORTANT: Multiple classes and nested static classes are supported */


//uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class maximumBorder{
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
            int rows = scan.nextInt();
            int columns = scan.nextInt();
            char[][] matrix = new char[rows][columns];
            for(int j = 0; j < rows; j++){
                for(int k = 0; k < columns; k++){
                    matrix[j][k] = scan.next().charAt(0);
                }
            }
            int maxBorder = maxBorderShapes(rows, columns, matrix);
            System.out.println(maxBorder);
        }

    }
    public static int maxBorderShapes(int row, int column, char[][] matrix){
        int maxResult = 0;
        for(int i = 0; i < row; i++){
            int count = 0;
            for(int j = 0; j < column; j++){
                if(matrix[i][j] == '#'){
                    count++;
                } 
            }
            if(count > maxResult){
                maxResult = count;
            }
        }
        return maxResult;
    }
}

