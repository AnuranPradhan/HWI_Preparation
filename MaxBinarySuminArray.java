package HWI_Preparation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxBinarySuminArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String A = sc.next();
            String B = sc.next();
            int a = Integer.parseInt(A, 2);
            int b = Integer.parseInt(B, 2);
            int c = a + b;
            arr.add(c);

        }
        System.out.println(arr);
        int maxVal = Collections.max(arr);
        System.out.println(maxVal + "->" + Integer.toBinaryString(maxVal));

    }
}