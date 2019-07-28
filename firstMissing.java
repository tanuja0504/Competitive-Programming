package google2019;

public class firstMissing {
    public int firstMissingPositive(int[] nums) {
        int result = 1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && nums[i]==result){
                result++;
            }
        }

        return result;
    }
}
