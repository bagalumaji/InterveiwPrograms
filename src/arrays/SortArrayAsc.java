package arrays;

public class SortArrayAsc {
    public static void main(String[] args) {
        int []a = {2,1,4,5,3};

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    int t=a[i];
                    a[i] = a[j];
                    a[j]=t;
                }
            }
        }
        for (int x:a)
            System.out.println(x);

    }
}
