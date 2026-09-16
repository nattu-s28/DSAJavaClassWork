// Problem:
// After reading each element, print the maximum value seen so far.
// Input:
// 2 5 1 8 3
// output:
// 2 5 5 8 8

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int size = sc.nextInt();
            int arr[] = new int[size]; 
            for (int i = 0; i < size; i++){
                arr[i] = sc.nextInt();
            }
            int Max = Integer.MIN_VALUE;
            for (int i = 1; i < size; i++){
                Max = Math.max(Max,arr[i]);
                System.out.print(Max + " ");
            }
        }
        catch (Exception e){
            System.out.println("Invalid Input");
        }
    }
}
