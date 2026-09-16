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
