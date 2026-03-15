package HWI_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinShiftCards {
    public static int minShiftCards(List<String> cards, int s, String end) {
        int n = cards.size();
        int e = cards.indexOf(end);
        if (s == e) {
            return 0;
        }
        if (Math.abs(s - e) == 1) {
            return 1;
        }
        int forward, backward;
        if (e > s) {
            forward = e - s;
            backward = s + (n - 1 - e) + 1;
        } else {
            forward = e + (n - 1 - s) + 1;
            backward = s - e;
        }
        return Math.min(forward, backward);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<String> cards = Arrays.asList(sc.nextLine().split(" "));
        int s = Integer.parseInt(sc.nextLine());
        String target = sc.nextLine();

        System.out.println(minShiftCards(cards, s, target));
        sc.close();
    }
}
