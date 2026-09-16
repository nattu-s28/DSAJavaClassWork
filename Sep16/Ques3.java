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
