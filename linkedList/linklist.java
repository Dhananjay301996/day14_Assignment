package linkedList;
import java.util.LinkedList;
import java.util.Scanner;
/*
 * Collection Framework.
 */

public class linklist {

	public static void main(String[] args) {
		LinkedList<Integer>list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		/*
		 * Add first & Last
		 */
		
		System.out.println("Creating New Linked List");
		list.addFirst(70);
		list.addFirst(30);
		list.addFirst(56);
		System.out.println(list);
		
		System.out.println(" ");
		System.out.println("Size of List");
		System.out.println(list.size());
		
		/*
		 * Remove First & Last
		 */
		System.out.println(" ");
		System.out.println("Linked List after Deleting First and Last Element");
		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		System.out.println(" ");
		System.out.println("Linked List after Adding First and Last Element");
		list.addFirst(56);
		list.addLast(70);
		System.out.println(list);
		
		/*
		 * Search Element Index
		 */
		System.out.println(" ");
		System.out.println("Searching Linked List element index");
		int firstIndex = list.indexOf(sc.nextInt());
		System.out.println("Index number is = "+firstIndex);
		
		int lastIndex = list.lastIndexOf(sc.nextInt());
		System.out.println("Index number is = "+lastIndex);
		
		
		/*
		 * Element exist or not
		 */
		System.out.println(" ");
		System.out.println("Check for Element exist or not in our Linked List");
		if(list.contains(sc.nextInt())) {
			System.out.println("Number is Exists");
		}
		else {
			System.out.println("Number is not Exists");
		
		}
		Scanner close;
		 /*
		  * Ascending order
		  */
		
		for(int i=0; i<list.size()-1; i++) {
			for(int j=0; j<list.size()-i-1; j++) {
				
			}
		}

	}

}
