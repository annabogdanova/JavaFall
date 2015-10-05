package Stack;

public class Stack<T> {

	class Node {
        T data;
        Node next;
    }
	
	Node top;
	
	private void push(T data) {
		Node node = new Node();
		node.data = data;
		node.next = top;
		top = node;
	}
	
	private T pop() {
		Node node = top;
		top = top.next;
		return node.data;
	}
	
	@Override
	public String toString() {
		
		String s = "[";
		
		Node temp = top;
		
		while (temp != null) {
			s += temp.data;
			if (temp.next != null) {
				s += ", ";
				temp = temp.next;
			}
			else
				break;
		}
		
		return s + "]";
	}
	
	public static void main(String[] args) {
		
		 Stack<String> list = new Stack<>();

	        list.push("One");
	        list.push("Two");
	        list.push("Three");
	        System.out.println(list);
	        list.pop();
	        System.out.println(list);
	        
	}
}
