package google;

public class TrappingRainWater {

	 public int trap(int[] height) {
	        int left=0;
	        int right=height.length-1;
	        int left_max = -1;
	        int right_max=-1;
	        int answer=0;
	        	        
	        while(left<right){	 	        	
	        	if(height[right]>=height[left]){
	        		if(height[left]>left_max){
	        			left_max=height[left];
	        		}
	        		else{
	        			answer = answer + (left_max-height[left]);	        			
	        		}
	        		left++;
	        	}
	        	
	        	else{
	        		if(height[right]>right_max){
	        			right_max=height[right];
	        		}
	        		else if(height[right]<right_max){
	        			answer = answer + (right_max-height[right]);	        			
	        		} 
	        		right--;
	        	}	
	        }	        
	        return answer;
	    }
	public static void main(String[] args) {
		TrappingRainWater obj = new TrappingRainWater();
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int result = obj.trap(height);
		System.out.println(result);
	}

}
