package may;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


enum color{
	RED,GREEN,BLUE;
}
public class removeDuplicate {

	public static void main(String[] args){
		
	    Map<String,Integer> h = new TreeMap<String,Integer>();
	    h.put("C",1);
	    h.put("D",13);
	    h.put("A",11);
	    h.put("B",1);
	    	    
	    for(Map.Entry<String,Integer> e : h.entrySet()){
	    	System.out.println(e.getKey()+" "+e.getValue());	    	
	    }
	    
	    int input[] = {1,2,3,4,5,6,7,8};
	    System.out.println(Arrays.stream(input).sum());
	    
	    String[] myArray = { "this", "is", "a", "sentence" };
	    String result = Arrays.stream(myArray)
	                    .reduce("", (a,b) -> a + b);
	    System.out.println(result);
	    
	    try{
	    	System.out.println(input[8]);	    	
	    }catch(NullPointerException e){
	    	System.out.println("Null");
	    }catch(ArrayIndexOutOfBoundsException e1)
	    {
	    	System.out.println("Noo");
	    }catch(Exception e1)
	    {
	    	System.out.println("NooNoo");
	    }finally{
	    	System.out.println("Why??");
	    }	
	        	    
	   System.out.println(color.BLUE);
	   
	
	    
	}
}
