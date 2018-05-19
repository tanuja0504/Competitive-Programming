package may;

import java.util.Scanner;

public class kBitSet {

	public int getfirstBitDiff(int input1,int input2){
		int result=0;
		int count = 0;
		while(input1>=0 && input2>=0){		
			count++;
			if(input1%2!=input2%2){		
				result = count;

				return result;
			}
						
			input1=input1/2;
			input2=input2/2;
		}		
		return result;
	}
	public static void main(String[] args) {
		kBitSet obj = new kBitSet();
	/* 	Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		
		for(int i=0;i<testCases;i++){
			int input1 = scan.nextInt();
			int input2 = scan.nextInt();
			int result = obj.getfirstBitDiff(input1,input2);
				System.out.println(result);	
		}
*/
		
		int x=4;
		System.out.println(x);
		x = x <<1;
		
		System.out.println(x);
	}
}
