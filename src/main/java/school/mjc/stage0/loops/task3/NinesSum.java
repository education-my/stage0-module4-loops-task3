package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        String str = "";
        int sum = 0;
        for (int l = 1; l <= lengthOfLastNumber; l++) {
            str += "9";
            sum += Integer.parseInt(str);
        }
        System.out.println(sum);
    }
}
