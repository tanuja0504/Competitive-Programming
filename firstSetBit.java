package may;

import java.util.Scanner;

public class firstSetBit {
	
	public int getfirstSetBit(int input){
		int result=0;
		int count = 0;
		while(input>0){
			count++;
			if(input%2==1){
				result=count;
				return result;
			}
			input = input/2;			
		}
		
		return result;
	}

	public static void main(String[] args) {
		firstSetBit obj = new firstSetBit();
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		
		for(int i=0;i<testCases;i++){
			int input = scan.nextInt();
			int result = obj.getfirstSetBit(input);
				System.out.println(result);	
		}

	}

}
