package main;
import LinkedList.*;

public class Main {
	
	public static void printNode(LinkedNode h) {
		if (h==null) {
			System.out.println("Not found");
		} else {
			System.out.printf("%d\n", h.getNodenumber());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a_list = new LinkedList();
		
		for (int i=0; i<10; i++) {
			LinkedNode tmp = new LinkedNode(i);
			a_list.addNode(tmp);
		}
		
		a_list.show();
		
		a_list.delNode(100);
		a_list.delNode(10);
		a_list.delNode(-1);
		a_list.delNode(3);
		
		a_list.show();
		a_list.delNode(0);
		a_list.show();

		a_list.delNode(8);
		a_list.show();		
		
		LinkedNode h = a_list.getNode(0);
		printNode(h);
		h = a_list.getNode(-1);
		printNode(h);
		h = a_list.getNode(100);
		printNode(h);
		h = a_list.getNode(5);
		printNode(h);
		h = a_list.getNode(7);
		printNode(h);
		
		a_list.show();
		return;
	}
}
