package arrays;

public class SecondMaximumFromArray {
    public static void main(String[] args) {
        System.out.println("getSecondMaximum(new int[]{2,1,4,5,6,3}) = " + getSecondMaximum(new int[]{2, 1, 4, 5, 6, 3}));
    }
    static int getSecondMaximum(int []num){
        int max1=num[0];
        int max2=num[0];
        for (int i = 1; i <num.length ; i++) {
            if(num[i]>max1){
                max2=  max1;
                max1 = num[i];
            }else if(num[i]>max2){
                max2=num[i];
            }
        }
        return max2;
    }
}
