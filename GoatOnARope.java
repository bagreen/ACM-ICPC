import java.util.Scanner;

public class GoatOnARope {
    private static double ropeLength() {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        if (x >= x1 && x <= x2) {
            return Math.min(Math.abs(y1 - y), Math.abs(y - y2));
        }
        else if (y >= y1 && y <= y2) {
            return Math.min(Math.abs(x1 - x), Math.abs(x2 - x));
        }
        else {
            if (x > x2 && y > y2) {
                return Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2));
            }
            if (x > x2 && y < y1) {
                return Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y1, 2));
            }
            if (x < x1 && y > y2) {
                return Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y2, 2));
            }
            if (x < x1 && y < y1) {
                return Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(String.format("%.3f", ropeLength()));
    }
}