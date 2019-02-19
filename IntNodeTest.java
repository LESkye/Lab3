
public class IntNodeTest {
	public static void main(String[] args) {
		// Testing the no arguments constructor
		IntNode test1 = new IntNode();
		System.out.println(test1);
		System.out.println();
		
		// Testing the arguments given constructor
		IntNode test2 = new IntNode(2, test1);
		System.out.println(test2);
		System.out.println();
		
		// Testing the getValue function
		System.out.println(test2.getValue());
		
		System.out.println();
		// Testing the getLink function
		System.out.println(test2.getLink());
		
		System.out.println();
		// Testing the getLink function with a null link
		System.out.println(test1.getLink());
		
		System.out.println();
		// Testing the setValue function
		test1.setValue(1);
		System.out.println(test1);
		
		System.out.println();
		// Testing the setLink function
		IntNode test3 = new IntNode(3, null);
		test1.setLink(test3);
		System.out.println(test1);
		
		System.out.println();
		// Testing the listLength function
		System.out.println(test2.listLength(test2)); // should be 3
		
		System.out.println();
		// Testing the add node after this function
		test2.addNodeAfterThis(500);
		System.out.println(test2);
		
		System.out.println();
		// Testing the search function with an int that exists in the list
		if(test2.search(test2, 2))
			System.out.println("Argument found");
		else
			System.out.println("Argument not found");
		
		System.out.println();
		// Testing the search function with an int that doesn't exist in the list
		if(test2.search(test2, 4))
			System.out.println("Argument found");
		else
			System.out.println("Argument not found");
		
		System.out.println();
		// Testing the search function with a null head
		if(test2.search(test3, 2))
			System.out.println("Argument found");
		else
			System.out.println("Argument not found");
		
		System.out.println();
		// Testing the removeNodeAfter function
		test2.removeNodeAfterThis();
		System.out.println(test2);
		
		System.out.println();
		// Testing the removeNodeAfter function at the tail end
		test3.removeNodeAfterThis(); //Should throw error
		System.out.println(test3);
	}
}
