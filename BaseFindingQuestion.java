package HWI_Preparation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BaseFindingQuestion {

    public static boolean baseFinding(int M, int B) {
        Set<Integer> digits = new HashSet<>();
        int temp = M;
        while (temp > 0) {
            digits.add(temp % B);
            temp = temp / B;
        }

        return digits.size() == 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int minBase = 2;
        for (int B = minBase; B < M; B++) {
            if (baseFinding(M, B)) {
                System.out.println("The Minimum Base is :" + B);
                break;
            }

        }
        sc.close();

    }

}
