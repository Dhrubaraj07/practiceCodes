package JavaPractice;

public class examPractice {
    public static void main(String[] args) {
        int[] nums={0};
        if(nums.length<=1) System.out.println(nums[0]);
        else{
            sortZero(nums);
            for(int i=0;i<nums.length;i++) System.out.println(nums[i]);
        }
    }

    private static int[] sortZero(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i;j<nums.length-1;j++){
                if(nums[j]==0) swap(nums,j,j+1);
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
