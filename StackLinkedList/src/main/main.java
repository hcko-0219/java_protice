package main;

import LinkedList.*;

public class main {

	public static void main(String[] args) {
		
		LinkedList a_list = new LinkedList();
		
		LinkedNode a = new LinkedNode(11);
		LinkedNode b = new LinkedNode(12);
		LinkedNode c = new LinkedNode(13);
		
		a_list.pushNode(a);
		a_list.pushNode(b);
		a_list.pushNode(c);
		
		a_list.show();
		a_list.popNode();
		a_list.show();
		a_list.popNode();
		a_list.show();
		a_list.popNode();
		a_list.show();
		
	}

}
