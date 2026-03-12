package HWI_Preparation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MonsterGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the monster");
        int n = sc.nextInt();
        System.out.println("Enter the Level of the Player");
        int lev = sc.nextInt();
        int p[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        List<int[]> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new int[] { p[i], b[i] });
        }
        a.sort(Comparator.comparingInt(x -> x[0]));
        int ans = 0;
        for (int[] num : a) {
            int power = num[0];
            int bonus = num[1];

            if (power > lev) {
                break;
            }
            lev += bonus;
            ans++;
        }
        System.out.println("Number of monster can be defeated:" + ans);
    }

}
