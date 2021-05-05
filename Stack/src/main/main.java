package main;

import Stack.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack a = new Stack();
		
		a.push(1);
		a.show();
		System.out.printf("\n");
		a.push(2);
		a.show();
		System.out.printf("\n");
		System.out.printf("%d\n",a.pop());
		a.show();
		System.out.printf("\n");
		a.push(3);
		a.show();
		System.out.printf("\n");
		a.push(4);
		a.show();
		System.out.printf("\n");
		System.out.printf("%d\n",a.pop());
		a.show();
		System.out.printf("\n");
		a.push(5);
		a.show();
		System.out.printf("\n");
		a.push(6);
		a.show();
		System.out.printf("\n");
		System.out.printf("%d\n",a.pop());
		a.show();
		System.out.printf("\n");
	}

}
