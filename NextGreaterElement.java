package google2019;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int temp = -1;
            int j=0;
            while (j<nums2.length){
                if(nums1[i]==nums2[j]) {
                    break;
                }
                else{
                    j++;
                }
            }
            while(j<nums2.length){
                if(nums1[i]<nums2[j]){
                    result[i]=nums2[j];
                    break;
                }else
                j++;
            }
            if (j==nums2.length){
                result[i]=-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums1[] = {2,4};
        int nums2[] = {1,2,3,4};
        int nums3[] = nextGreaterElement(nums1,nums2);
        for(int i=0;i<nums1.length;i++){
            System.out.println(nums3[i]);
        }
    }
}
