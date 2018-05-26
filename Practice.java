package google;

import java.util.Set;
import java.util.TreeSet;

public class Practice {

    public int kEmptySlots(int[] flowers, int k) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        int day=0;
        for(int flower : flowers){
            day++;
            set.add(flower);
            Integer higher = set.higher(flower);
            Integer lower = set.lower(flower);
            
            
            if(lower!=null && flower-lower==k+1){
            	return day;
            	
            }else if (higher!=null && higher-flower==k+1){
            	
            	return day;
            }
            
                       
        }
        return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
