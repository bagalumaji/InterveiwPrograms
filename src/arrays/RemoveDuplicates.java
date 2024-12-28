package arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4,5,5};
        int cnt = removeDuplicates(nums);
        for (int i = 0; i <cnt; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    static int removeDuplicates(int[] nums) {
        int start = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[++start] = nums[i];
            }
        }
        return ++start;
    }
}
