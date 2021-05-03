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
		
		LinkedNode a = new LinkedNode(11);
		LinkedNode b = new LinkedNode(12);
		LinkedNode c = new LinkedNode(13);
		
		a_list.addNode(a);
		a_list.addNode(b);
		a_list.addNode(c);
		
		a_list.show();
		a_list.delNextNode(c);		
		a_list.show();
		System.out.printf("%d",a_list.getNodeposition(11));
		
		return;
	}
}