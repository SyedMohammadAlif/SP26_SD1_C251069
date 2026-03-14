//2. Find the largest number in an array
import java.util.*;

public class CW2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int arr[] = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }

        int largestNumber = 0;
        for (int i = 0; i < x; i++) {
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }
        System.out.println("Largest Number is: " + largestNumber);
    }
}
