package HWI_Preparation;

public class EvenOddIndex {
    public static void main(String[] args) {

        int n = 7;
        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 0; i <= n / 2; i++) {
            arr[2 * i] = arr[i];
            if ((2 * i) + 1 <= n) {
                arr[(2 * i) + 1] = arr[i] + arr[i + 1];
            }
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            System.out.println(arr[i]);
        }
        System.out.println("The max value is " + max);
    }

}
