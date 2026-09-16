// Problem Statement
// A weather station records the temperature every hour. For each hour, print the lowest temperature recorded from the first hour up to the current hour.

// Input Format
// N
// T1 T2 ... TN

// Output Format
// Print the running minimum.

// Constraints
// 1 ≤ N ≤ 100000
// -10^9 ≤ Ti ≤ 10^9

// Size	        Input	               Output
// 	5         30 28 31 25 27	       30 28 28 25 25
// 	5         5 4 3 2 1                5 4 3 2 1
// 	5         1 2 3 4 5	               1 1 1 1 1
// 	5         -2 -5 -1 -10 0	       -2 -5 -5 -10 -10
// 	1         -20	                   -20

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int size = sc.nextInt();
            int arr[] = new int[size]; 
            for (int i = 0; i < size; i++){
                arr[i] = sc.nextInt();
            }
            int Min = Integer.MAX_VALUE;
            for (int i = 0; i < size; i++){
                Min = Math.min(Min,arr[i]);
                System.out.print(Min + " ");
            }
        }
        catch (Exception e){
            System.out.println("Invalid Input");
        }
    }
}
