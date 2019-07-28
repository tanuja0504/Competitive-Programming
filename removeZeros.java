package google2019;

public class removeZeros {
    public static void remove(int[] nums){
        int index=-1;
        for(int i=0;i<nums.length-1;i++){
            System.out.println(index);
            int temp=0;
            if(nums[i]==0) {
                temp=i;
                while (nums[i]==0){
                    index++;
                    i++;
                }
            }
                nums[temp]=nums[i];
        }
        for(int i=index;i<nums.length;i++)
        nums[i]=0;
    }

    public static void main(String as[]){
        int nums[]={0,1,0,3,0,2};
        remove(nums);
        System.out.println("-----");
        for(int i=0;i<nums.length;i++)
        System.out.println(nums[i]);

    }
}
