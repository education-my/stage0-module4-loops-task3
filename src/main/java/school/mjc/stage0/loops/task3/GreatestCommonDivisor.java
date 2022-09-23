package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 1;
        if (first == 0 && second != 0) {
            gcd = second;
        } else if (second == 0 && first != 0) {
            gcd = first;
        } else {
            for (int n = 1; n <= first && n <= second; n++) {
                if (first % n == 0 && second % n == 0) {
                    gcd = n;
                }
            }
        }
        System.out.println(gcd);
    }
}
