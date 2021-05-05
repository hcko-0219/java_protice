package Stack;

public class Stack {
	public int index = 0;
	public int[] arr = new int[30];
	
	public void push(int data) {
		if (index == 0) {
			arr[index] = data;
			++index;
		} else {
			arr[index] = data;
			++index;
		}
	}
	
	public int pop() {
		if (index > 0 ) {
			--index;
			return arr[index];
		} else if (index == 0) {
			return arr[index];
		} else {
			System.out.printf("NO Data \n");
			return 0;
		}
	}
	
	public void show() {
		for (int i=0; i<index; ++i)
		System.out.printf("%d ->",arr[i]);
	}
}
