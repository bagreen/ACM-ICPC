import java.util.*;

public class TimeLimits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();

        int largest = 0;

        for (int i = 0; i < n; i++) {
            int current = in.nextInt();

            if (current > largest) {
                largest = current;
            }
        }

        double output = Math.ceil(largest / (1000.0) * s);
        System.out.println((int) output);
    }
}