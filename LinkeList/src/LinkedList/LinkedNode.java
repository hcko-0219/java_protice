package LinkedList;

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
	
	public void setNodenumber(int number) {
		this.node_number = number;
	}
	
	public void setNextnode(LinkedNode next) {
		this.linkednode_next = next;
	}
	
	public int getNodenumber() {
		return this.node_number;
	}
	
	public LinkedNode getNextnode() {
		return this.linkednode_next;
	}
}
