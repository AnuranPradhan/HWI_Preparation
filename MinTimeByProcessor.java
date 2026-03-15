package HWI_Preparation;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinTimeByProcessor {

    public static int minTimeByProcessor(List<Integer> processorTime, List<Integer> taskTime) {

        int n = taskTime.size();
        int m = processorTime.size();
        Collections.sort(processorTime);
        Collections.sort(taskTime);
        int j = n - 1;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            int c = 0;
            while (c < 4 && j >= 0) {
                ans = Math.max(ans, processorTime.get(i) + taskTime.get(j));
                c++;
                j--;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        List<Integer> processorTime1 = Arrays.asList(8, 10);
        List<Integer> tasks1 = Arrays.asList(2, 2, 3, 1, 8, 7, 4, 5);

        System.out.println("Example 1 Output: " +
                minTimeByProcessor(processorTime1, tasks1));
    }
}
