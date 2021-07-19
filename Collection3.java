 import java.util.*;
 class Collection3
 {
 	public static void main(String[] args) 
 	{
 		LinkedList linkedlist=new LinkedList();
 		for(int i=65;i<=90;i++)
 		{
 			linkedlist.add(/*(char)*/i);
 		}
 		System.out.println(linkedlist);
 		linkedlist.removeFirst();	
 		linkedlist.removeLast();
 		linkedlist.remove((23));
		System.out.println(linkedlist);
		System.out.println("Size="+linkedlist.size()); 		

 	}
 }