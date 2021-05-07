package main;

import Queue.*;

public class main {

	public static void main(String[] args) {
		
		Queue a_list = new Queue();
		
		for (int i=0; i<20; ++i) {
			LinkedNode tmp = new LinkedNode(i);
			a_list.pushNode(tmp);
			tmp = new LinkedNode(i+1);
			a_list.pushNode(tmp);
			tmp = new LinkedNode(i+2);
			a_list.pushNode(tmp);
			
			a_list.show();
			a_list.popNode();
			a_list.popNode();
			a_list.show();			
		}
	}

}
