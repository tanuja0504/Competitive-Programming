package google;

import java.util.*;


public class ClosestTime {

	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<Integer>();
		HashSet<Integer> hset1 = new HashSet<Integer>();
		Stack<Integer> s = new Stack<Integer>();
			int time=1939;
			int temp = time;
		while(temp>0){
			int x=temp%10;
			hset.add(x);
			temp = temp/10;
		}
			
		for(int i=0;i<2400;i++){
			if(i%100<60){
				s.push(i);				
			}
		}
		int element=s.pop();
		while(element>time){
			element = s.pop();
			while(element>0){
				int x= element%10;
				hset1.add(element);
				element=element/10;				
			}
			if(hset.equals(hset1))
				System.out.println(hset1);
		}
	}

}
