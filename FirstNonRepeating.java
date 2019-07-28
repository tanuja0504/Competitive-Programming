package google2019;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

class CountIndex{
    int count,index;
    CountIndex(int i){
        this.count=0;
        this.index=i;
    }
    void incCount(){
        this.count++;
    }
}
public class FirstNonRepeating {
    public static int firstUniqChar(String s){
        int result =-1;
        Map<Character,CountIndex> map = new HashMap<Character, CountIndex>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
               map.get(s.charAt(i)).incCount();
            }else
                map.put(s.charAt(i),new CountIndex(i));
        }
        int temp= Integer.MAX_VALUE;
        for(Map.Entry<Character,CountIndex> entry : map.entrySet()){
            System.out.println("Entry Set="+entry.getKey());
            if(entry.getValue().count==0){
                if(temp>entry.getValue().index)
                { temp = entry.getValue().index;
                }
            }
        }
        if(temp<Integer.MAX_VALUE)
            result=temp;
        return result;
    }

    public static void main(String as[]){
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
