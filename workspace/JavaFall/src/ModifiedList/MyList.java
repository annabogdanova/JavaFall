package ModifiedList;

public class MyList<T> {
	
	class Node {
        T data;
        Node next;
    }

    Node first;
    Node last;
	
	public void add(T data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

        if (first == null)
            first = node;
        else
            last.next = node;

        last = node;
	}
	
	@Override
	public String toString() {
		
		String s = "[";
		
		Node temp = first;
		
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

}
