package ModifiedList;

public class UseList {

	public static void main(String[] args) {
		
		MyList<String> list = new MyList<>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		System.out.println(list);
	}
}
