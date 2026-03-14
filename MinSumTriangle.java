package HWI_Preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinSumTriangle {
    public static int minSumTriangle(List<List<Integer>> triangle) {
        int n = triangle.size();
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int left = triangle.get(i + 1).get(j);
                int right = triangle.get(i + 1).get(j + 1);
                int min = Math.min(left, right);
                triangle.get(i).set(j, triangle.get(i).get(j) + min);

            }
        }
        return triangle.get(0).get(0);

    }

    public static void main(String[] args) {

        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        System.out.println(minSumTriangle(triangle));

    }

}
