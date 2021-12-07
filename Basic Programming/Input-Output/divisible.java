import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(arr_A[i]);
        }
        String out_ = solve(A, N);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    /*  To solve this, first know the divisibility condition for 11.
        Divisibility condition for 11:
            The difference between the sum of digits at even places and the sum of digits at odd places should be zero or it should be divisible by 11.
    */
    static String solve(int[] A, int N){
        // Write your code here
        int sum = 0;
        for(int i = 0; i < (N/2); i++){
            // Here I got the first digit of the numbers of first half of array.
            while(A[i] >= 10){
                A[i] /= 10;
            }
            if((i+1) % 2 == 0){
                sum += A[i];
            }
            else{
                sum += (A[i] * (-1));
            }
        }
        for(int i = (N/2); i < N; i++){
            A[i] %= 10;
            if((i+1) % 2 == 0){
                sum += A[i];
            }
            else{
                sum += (A[i] * (-1));
            }
        }
        // I have added the digits at even places and subtracted the digits at odd places.
        if(sum == 0 || sum % 11 == 0){
            return "OUI";
        }
        return "NON";
    }
}
