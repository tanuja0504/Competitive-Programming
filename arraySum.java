package may;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class arraySum {

	public static void main(String[] args) {
		int input[] = {4,5,6,7,1,2,3};
		int target = 10;
		Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		for(int i=0;i<input.length;i++){
			if(hmap.containsKey(input[i])){
				System.out.println(hmap.get(input[i]));
			}
			else{
			int value = target-input[i];
			hmap.put(value, i);
			}
			
			
			
		}

	}

}
