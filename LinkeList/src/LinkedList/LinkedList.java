package LinkedList;

public class LinkedList {
	public LinkedNode head = null;
	public int index= 0;
	
	public void addNode(LinkedNode node) {
		index++;
		if (head == null) {
			head = node;	
		} else {
			LinkedNode curr_node = head;
			while (curr_node.getNextnode() != null) {
				curr_node = curr_node.getNextnode();
			}
			curr_node.setNextnode(node);
		}
	}
	
	public void delNode(int number) {
		LinkedNode curr_node = head;
		if (number >= index || number < 0) {
			System.out.printf("The position is over \n");
		} else if (number == 0) {
			head = head.getNextnode();
			index--;
		} else {
			for (int i=0; i<(number-1); ++i) {
				curr_node = curr_node.getNextnode();
			}
				curr_node.setNextnode(curr_node.getNextnode().getNextnode());
				index--;
		}
	}
	
	public LinkedNode getNode(int number) {
		LinkedNode curr_node = head;
		if (number > index || number < 0) {
			return null;
		} else {
			for (int i=0; i<number; ++i) {
				curr_node = curr_node.getNextnode();
			}
			return curr_node;
		}
	}
	
	public void show() {
		LinkedNode curr_node = head;
		for (int i=0; i<index; ++i) {
			System.out.printf("%d -> ",curr_node.getNodenumber());
			curr_node = curr_node.getNextnode();
		}
		System.out.printf("null \n");
	}
}
