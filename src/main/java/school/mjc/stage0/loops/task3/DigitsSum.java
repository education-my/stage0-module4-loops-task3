package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String string = Math.abs(t) + "";
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            sum += Integer.parseInt(string.charAt(i) + "");
        }
        System.out.println(sum);
    }
}
