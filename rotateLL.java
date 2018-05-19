package may;

import java.util.LinkedList;
import java.util.Scanner;

class LinkedListNode{
	int d;
	LinkedListNode next;
	LinkedListNode prev;
	public LinkedListNode(int d) {
		this.d = d;
		this.next = null;
	}
}

public class rotateLL {

	public LinkedListNode rotateList(LinkedListNode head,int k){
		LinkedListNode obj = head;
		LinkedListNode target = head;
		for(int i=0;i<k;i++){
			obj = obj.next;
			target=obj.next;
		}
		obj.next=null;
		obj=target;
		while(obj.next!=null){
			obj=obj.next;
		}
		obj.next=head;
		System.out.println("Swapping "+obj.d);
		head = target;
		System.out.println("Swapping "+head.d);
		return head;
		
	}
	public static void main(String[] args) {
		
		rotateLL obj = new rotateLL();
		
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i=0;i<testCases;i++){
			int elements = scan.nextInt();
			LinkedListNode list[]= new LinkedListNode[elements];
			for(int j=0;j<elements;j++){
				 list[j] = new LinkedListNode(scan.nextInt());		
			}			
			for(int j=0;j<elements-1;j++){
				list[j].next = list[j+1];
			}
			LinkedListNode head = list[0];
			int rotateBy = scan.nextInt();
			head = obj.rotateList(head,rotateBy);
			while(head.next!=null){
				System.out.print(head.d+" ");
				head=head.next;
			}
		}
	}

}
