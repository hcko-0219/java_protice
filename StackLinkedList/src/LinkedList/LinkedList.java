package LinkedList;

public class LinkedList {
	public LinkedNode head = null;
	public int index= 0;
	
	public void pushNode(LinkedNode node) {
		index++;
		if (head == null) {
			head = node;	
		} else {
			LinkedNode curr_node = head;
			while (curr_node.getNextNode() != null) {
				curr_node = curr_node.getNextNode();
			}
			curr_node.setNextNode(node);
		}
	}

	public LinkedNode popNode() {
		LinkedNode curr_node = head;
		LinkedNode result_node;
		if (index < 0) {
			return null;
		} else {
			for (int i=0; i<index-1; ++i) {
				curr_node = curr_node.getNextNode();
			}
			result_node = curr_node.getNextNode();
			curr_node.setNextNode(null);
			index--;
			return result_node;
		}
	}
		
	public void show() {
		LinkedNode curr_node = head;
		for (int i=0; i<index; ++i) {
			System.out.printf("%d -> ",curr_node.getNodeNumber());
			curr_node = curr_node.getNextNode();
		}
		System.out.printf("null \n");
	}
}
