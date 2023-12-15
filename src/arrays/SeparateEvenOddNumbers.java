package arrays;

public class SeparateEvenOddNumbers {
    public static void main(String[] args) {
        int [] arr = {2,1,4,3,5,6};
        int  [] result = new int[arr.length];
        int evenCount=0;
        for (int even : arr) {
            if(even%2 ==0){
                evenCount++;
            }
        }
        int e=0;
        for (int j : arr) {
            if (j % 2 == 0) {
                result[e++] = j;
            } else {
                result[evenCount++] = j;
            }
        }
        for (int val:result){
            System.out.println("val = " + val);
        }
    }
}
