package Stack;

import java.util.LinkedList;

public class LikedList {
public static void main(String[] args) {
	// LinkedList=Stores Nodes in 2 Part(Data+Adress)
	//			  Nodes are in Non-consecutive memory allocations
	//			  Element are Linked using Pointers
	
	//  				Single Linked List - 
	//        Node            Node                  Node
	//	[data|address] ->  [data | address]   -> [data| address]
	
	//  				Double Linked List - 
	//        Node                     Node                  Node
	//	[address|data|address] ->  [address | data | address]   -> [address |data| address]
	
	//			Advantage 
	//			1.Dynamic Data Structure(Allocation needs memory while running)
	//			2.Insertion and deletion of Node is Easy 
	//			3.No/Low Memory Waste
	
	//			Disadvantage 
	//			1.Greater Memory  usage (Additional pointer )
	//			2.No Random access of elements (no Index[i])
	//			3.Accessing/searching elements is more time consuming 
	
	//			Uses?
	//			1.implement stacks/queue
	// 			2.GPS Navigation
	//			3.Music playlist
	
	
	
	LinkedList<String> linkedlist = new LinkedList<String>();
	/*
	linkedlist.push("A");
	linkedlist.push("B");
	linkedlist.push("C");
	linkedlist.push("D");
	linkedlist.push("F");
	linkedlist.pop();
	*/
	linkedlist.offer("A");
	linkedlist.offer("B");
	linkedlist.offer("C");
	linkedlist.offer("D");
	linkedlist.offer("F");
	//linkedlist.poll();
	linkedlist.add(4,"E");
	linkedlist.remove("E");
	System.out.println(linkedlist.peekFirst());
	System.out.println(linkedlist.peekLast());
	linkedlist.addFirst("0");
	linkedlist.addLast("G");
	
	String First = linkedlist.removeFirst();
	String Last = linkedlist.removeLast();
	
	
	System.out.println(linkedlist);
	
	
}
}
