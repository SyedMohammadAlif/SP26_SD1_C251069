import java.util.*;

public class CW6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int arr[] = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }

        int y = input.nextInt();
        boolean f = false;
        for (int i = 0; i < x; i++) {
            if (arr[i] == y) {

                f = true;
                break;
            }
        }

        if (f)
            System.out.println("Found");
        else
            System.out.println("Not found");
    }
}