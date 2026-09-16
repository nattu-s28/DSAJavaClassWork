
import java.util.*;
// Count the Frequency of the target number in the array
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            char[] arr = sc.nextLine().toCharArray();
            char target = sc.next().charAt(0);
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == target) count++;
            }
            System.out.println(count);
        }
        catch (Exception e){
            System.out.println("Invalid Input");
        }
    }    
}
