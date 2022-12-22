package lang.print.gaps.task5;

import java.util.Scanner;

public class TimeConvertor {
    public void convert(float minutes) {
        float seconds;
        seconds = 1;
        float halfMinutes = 30;
        float oneMinutes = 60 * seconds;
        float tenMinutes = 10 * oneMinutes;
        float res = tenMinutes + oneMinutes + halfMinutes;
        System.out.println(res);
    }
}
