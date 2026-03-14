//3. Find the smallest number in an array
import java.util.*;

public class CW3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int arr[] = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }

        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < x; i++) {
            if (arr[i] < smallestNumber) {
                smallestNumber = arr[i];
            }
        }
        System.out.println("Smallest Number is: " + smallestNumber);
    }
}
