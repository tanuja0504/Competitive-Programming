package google2019;

public class RemoveDuplicates {

	 static int count=0;
		public int removeDuplicates(int[] nums) {
		       
		        for(int i=0;i<nums.length-1;i++){           
		                if(nums[i]==nums[i+1])   
		                {
		                    count++;   
		                } 
		            else{
		                System.out.println(nums[i]);
		            }
		        }
		        return count;
		    }

	public static void main(String[] args) {
		int nums[] = {1,1,2};
		RemoveDuplicates obj = new RemoveDuplicates();
		int x = obj.removeDuplicates(nums);
		System.out.println(x);

	}

}
