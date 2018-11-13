import java.util.*;

public class Exam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        String yourAnswers = in.next();
        String friendsAnswers = in.next();

        int n = yourAnswers.length();
        int same = 0;

        for (int i = 0; i < n; i++) {
            if (yourAnswers.charAt(i) == friendsAnswers.charAt(i)) {
                same++;
            }
        }

        System.out.println(n - Math.abs(same - k));
        in.close();
    }
}