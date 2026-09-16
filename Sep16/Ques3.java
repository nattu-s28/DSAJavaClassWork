// Running Range
// Problem Statement
// Given an array of daily measurements, after each day calculate:
// maximum value seen so far - minimum value seen so far
// Example
// Input:
// 5
// 10 5 15 8 20

// Running maximum:
// 10 10 15 15 20

// Running minimum:
// 10 5 5 5 5

// Range:
// 0 5 10 10 15
// Input Format
// N
// A1 A2 ... AN
// Output Format

// Print the running range after every element.

// Constraints
// 1 ≤ N ≤ 100000
// -10^9 ≤ Ai ≤ 10^9
// Test Cases
// #	Input	                        Output
// 1	5 / 10 5 15 8 20	      0 5 10 10 15
// 2	4 / 5 5 5 5	              0 0 0 0
// 3	5 / 1 2 3 4 5	              0 1 2 3 4
// 4	5 / 10 8 6 4 2	      0 2 4 6 8
// 5	5 / -5 0 -10 10 5	      0 5 5 20 20

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int size = sc.nextInt();
            int arr[] = new int[size]; 
            for (int i = 0; i < size; i++){
                arr[i] = sc.nextInt();
            }
            int Max = Integer.MIN_VALUE;
            int Min = Integer.MAX_VALUE;
            for (int i = 0; i < size; i++){
                Max = Math.max(Max,arr[i]);
                Min = Math.min(Min,arr[i]);
                System.out.print(Math.abs(Max - Min) + " ");
            }
        }
        catch (Exception e){
            System.out.println("Invalid Input");
        }
    }
}