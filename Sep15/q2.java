
import java.util.*;
// Count the all Frequency of the number in the array
public class q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{

            // int size = sc.nextInt();
            // int num = sc.nextInt();
            HashMap<Character, Integer> map = new HashMap<>();
            String s = sc.nextLine();
            for (int ch : ) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (int num : map.keySet()) {
                System.out.print(num + " " + map.get(num));
                System.out.println();
            }
        }
        catch (Exception e){
            System.out.println("Error Occured : "+ e);
        }
    }
}