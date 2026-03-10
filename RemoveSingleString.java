package HWI_Preparation;

import java.util.Scanner;

public class RemoveSingleString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char key = '1';
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == key) {
                String val = str.substring(0, i) + str.substring(i + 1);
                int finalVal = Integer.parseInt(val);
                max = Math.max(max, finalVal);
            }
        }
        System.out.println(max);
    }
}