package arrays;

public class SeparateEvenOddNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 5, 6};
        separateEvenOddNumbersFromArray(arr);
    }

    static void separateEvenOddNumbersFromArray(int[] arr) {
        int ep = 0;
        int op = arr.length - 1;
        while (ep < op) {
            if (arr[ep] % 2 == 0) {
                ep++;
            }
            if (arr[op] % 2 == 1) {
                op--;
            }

            if (arr[ep] % 2 == 1 && arr[op] % 2 == 0) {
                int t = arr[op];
                arr[op] = arr[ep];
                arr[ep] = t;
            }

        }
        for (int j : arr) {

            System.out.print(j + " ");
        }
    }
}
