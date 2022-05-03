package arrays;

public class MaximumNumberFromArray {
    public static void main(String[] args) {
        System.out.println("getMaximum(new int[]{1,2,5,3,4}) = " + getMaximum(new int[]{1, 2, 5, 3, 4}));
    }

    static int getMaximum(int[] num) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if(num[i]>max)
                max = num[i];
        }
        return max;
    }
}
