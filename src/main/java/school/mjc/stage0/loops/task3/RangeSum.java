package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = firstBoarder;
        for (int n = firstBoarder + 1; n <= secondBoarder; n++) {
            sum += n;
        }
        System.out.println(sum);
    }
}
