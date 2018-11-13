import java.util.HashSet;
import java.util.Scanner;

public class RepeatingGoldbachs {
    private static int countSteps(int number, HashSet<Integer> primes) {
        int steps = 0;

        while (number >= 4) {
            for (int q = number; q > 0; q--) {
                if (primes.contains(q)) {
                    if ((q - p) % 2 == 0) {
                        steps++;
                        number = q - p;
                    }
                }
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int sieveSize = 100000;
        HashSet<Integer> sieve = new HashSet<>();
        sieve.add(2);

        for (int i = 3; i < sieveSize; i += 2) {
            sieve.add(i);
        }

        int maximum = sieveSize;

        for (int i = 2; i < maximum; i++) {
            if (!sieve.contains(i)) {
                continue;
            }
            for (int j = 2; j < 1.0 * maximum / i; j++) {
                sieve.remove(i * j);
            }
        }

        System.out.println(countSteps(number, sieve));
    }
}