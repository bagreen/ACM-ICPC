import java.util.*;

public class Liars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] chances = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            for (int j = a; j <= b; j++) {
                chances[j]++;
            }
        }
        for (int i = n; i >= 0; i--) {
            if (chances[i] == i) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1")
    }
}