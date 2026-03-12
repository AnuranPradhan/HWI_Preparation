package HWI_Preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayRemovalCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int ans = 0;
        while (!arr.isEmpty()) {
            if (!arr.get(0).equals(arr.get(arr.size() - 1))) {
                arr.remove(arr.size() - 1);
                if (!arr.isEmpty()) {
                    arr.remove(0);
                    ans++;
                }

            } else {
                arr.remove(0);
                ans++;
            }
        }
        System.out.println(ans);
    }

}
