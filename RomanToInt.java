package google2019;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char input[]=s.toCharArray();
        int previous = map.get(input[0]);
        int result=previous;
        for(int i=1;i<input.length;i++){
            System.out.println("result"+result);
            int current =map.get(input[i]);
            if(previous<current) {
                result = result+(current-previous);
                i++;
            }
            if(previous>=current) {
                result = result + current;
            }
            previous=current;
        }

        return result;
    }

    public static void main(String as[]){
        System.out.println(romanToInt("MCMIV"));
    }
}
