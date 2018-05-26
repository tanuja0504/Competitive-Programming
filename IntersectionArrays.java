package google;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet hset = new HashSet();
        List list = new ArrayList();
        int len=Integer.min(nums1.length, nums2.length);
        int count=0;
        
        for(int value:nums1){
            hset.add(value);    
            System.out.println(hset.size());
        }
        
        for(int value:nums2){           
            if(hset.contains(value)){
                list.add(value);
                hset.remove(value);
                count++;
            }
        }
        int[] result = new int[list.size()];
      
        for(int i=0;i<list.size();i++){
        	result[i]=(int) list.get(i);
        }

      return result;  
    }
	public static void main(String[] args) {
		IntersectionArrays obj = new IntersectionArrays();
		int[] nums1 = {1,2};
		int[] nums2={1,1};
		int[] result = obj.intersection(nums1, nums2);
		for(int value : result) {System.out.println(value);}

	}

}
