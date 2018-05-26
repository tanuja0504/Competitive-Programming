package google;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringK {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
    	int maxLen = 0;    	
        Set<Character> set = new HashSet<Character>();    
        if(s.length()<k || k<1) {System.out.println("Returnign 0"); return 0; }
        
        for(int i=0;i<s.length();i++){
        	int count=k-1;
        	int tempLen =1;
            for(int j=i+1;j<s.length();j++){
            	if( (!set.contains(s.charAt(j))) && (count>0)){
            		set.add(s.charAt(j));
            		count--;            		
            	}
            	else 
            		tempLen++;
            	            	
            }System.out.println(s.substring(i, tempLen));
            if(maxLen<tempLen && count==0) { maxLen=tempLen;}
        } 
        
        return maxLen;
    }
	public static void main(String[] args) {
		LongestSubstringK obj = new LongestSubstringK();
		String s="eceba";
		int k=2;
		int result = obj.lengthOfLongestSubstringKDistinct(s, k);
			System.out.println(result);
	}

}
