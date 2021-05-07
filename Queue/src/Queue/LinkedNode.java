package Queue;

public class LinkedNode {
	private int node_number;
	private LinkedNode linkednode_next;
	
	public LinkedNode() {
		this.node_number = 0;
		this.linkednode_next = null;
	}
	
	public LinkedNode(int Val) {
		this.node_number = Val;
		this.linkednode_next = null;
	}
	
	public LinkedNode(int Val, LinkedNode next) {
		this.node_number = Val;
		this.linkednode_next = next;
	}
	
	public void setNodeNumber(int number) {
		this.node_number = number;
	}
	
	public void setNextNode(LinkedNode next) {
		this.linkednode_next = next;
	}
	
	public int getNodeNumber() {
		return this.node_number;
	}
	
	public LinkedNode getNextNode() {
		return this.linkednode_next;
	}

}
