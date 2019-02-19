// (1) the functionality of the methods, 
//(2) the parameters, 
//(3) the return values, 
//(4) the pre-conditions if there is any;

public class IntNode {
	
	//Defining instance variables
	private int value;
	private IntNode link;
	
	//No arguments constructor.
	//No parameters/preconditions. Will create an IntNode with value 0 and a null link. 
	public IntNode() {
		value = 0;
		link = null;
	}
	
	//Parameters provided constructor.
	//_value is the value of the int this IntNode will store. _link is the link this IntNode will link to.
	//Will create an IntNode object, with the given params. No preconditions.
	public IntNode(int _value, IntNode _link) {
		value = _value;
		link = _link;
	}
	
	//Assessor of value
	//Will return the value intstance variable value. No preconditions/parameters.
	public int getValue() {
		return value;
	}
	
	//Assessor of link
	//Will return the link that IntNode points to. No preconditions/parameters.
	public IntNode getLink() {
		return link;
	}
	
	//Mutator of value.
	//_value is the int that instance variable value should be set to. 
	//Precondition is that _value is in the accepted range of an int. 
	public void setValue(int _value) {
		value = _value;
	}
	
	//Mutator of link
	//_link is the IntNode that link should be set to. No preconditions
	public void setLink(IntNode _link) {
		link = _link;
	}
	
	//Will return how many nodes there are in a list
	//head is the  IntNode that it should begin counting from.
	//Will return an int for how many nodes there are from param head until it sees a null link.
	public int listLength(IntNode head) {
		IntNode cursor = head;
		int length = 1;
		
		while(cursor.getLink() != null) {
			length++;
			cursor = cursor.getLink();
		}
		
		return length;
	}
	
	//Will return a string version of IntNode (of the form "int1 -> int2 -> int3")
	//No parameters/preconditions
	public String toString() {
		String s = "" + this.getValue();
		IntNode cursor = this;
		while(cursor.getLink() != null) {
			cursor = cursor.getLink();
			s = s  + " -> " + cursor.getValue();
		}
		
		return s;
	}
	
	//Will add a new node after the current node (not replace the node after)
	//_value is the value that the new IntNode link should hold
	//precondition is that _value is in the accepted range for an int
	public void addNodeAfterThis(int _value) {
		IntNode cursor = this.getLink();
		IntNode addNode = new IntNode(_value, cursor);
		this.setLink(addNode);
	}
	
	//Will search for an int value starting from head
	//head is the IntNode that it should begin the search from
	//_value is the int that it is looking for, in the list.
	//Will return true if found, and false if not.
	//precondition is that head is not null.
	public boolean search(IntNode head, int _value) {
		if (head != null) {
			for(IntNode cursor = head; cursor != null; cursor = cursor.getLink()) {
				if (cursor.getValue() == _value)
					return true;
			}
		}		
		return false;
	}
	
	//Will remove the node after the IntNode calling this function.
	//No params/preconditions. No returns.
	public void removeNodeAfterThis() {
		link = link.link;		
	}
}
