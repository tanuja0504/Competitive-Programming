package google;

public class BoldTagString {
	
    public String addBoldTag(String s, String[] dict) {
        
    	StringBuilder sb = new StringBuilder();
    	String temp = new String(s);    
    	int output[] = new int[s.length()];
    	if(dict.length<=0)   	{
    		return s;
    	}
    	int index=0;
    	
    	for(int i=0;i<dict.length;i++){     		
    		int result = s.indexOf(dict[i],index); 
    		if(result>-1){
    			int length = dict[i].length();
    			while(result<length){
    				output[result]=1;   				
    				index++;
    				result++;
    				length--;
    			}
    			System.out.println(index);
    		}
    	}
    	

    	int i=0;
    	while(i<output.length){ 
    		
    		 if(output[i]>0){
    			sb.append("<b>");
    		try{
    			while(output[i]>0 && i<output.length){
    				sb=sb.append(s.charAt(i));
    				i++;    				
     			}
    			sb.append("</b>");    
    		}catch(ArrayIndexOutOfBoundsException a){
    			sb.append("</b>");
    			break;    		
    		 }
    		 }
			
    		 if(output[i]<=0){
    			 try{
    			while(output[i]<=0 && i<output.length){    				
    				sb=sb.append(s.charAt(i));
        			i++;        			      	    	
        		}
    			 }catch(ArrayIndexOutOfBoundsException a){
    				 break;
    			 }
    		}
    		
    	}
    	
    	return sb.toString();   	    	
    }
	public static void main(String[] args) {				
		String s ="aaabbcc";
		String[] dict = {"a","b","c"};
		BoldTagString obj = new BoldTagString();
		System.out.println("Result "+obj.addBoldTag(s, dict));

	}

}
