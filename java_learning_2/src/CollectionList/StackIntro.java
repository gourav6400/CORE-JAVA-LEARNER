package CollectionList;

import java.util.Stack;

public class StackIntro {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("B");
		stack.push("A");
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		stack.push("C");
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		
		
		stack.push("Java");
		stack.push("python");
		stack.push("RubyOnRails");
		stack.push("JavaScript");
		stack.push("Angular");
		
		//search:
		System.out.println(stack.search("python"));
		System.out.println(stack.search("JavaScript"));
		
		System.out.println(stack.search("react"));
		
		System.out.println(stack);
		System.out.println(stack.firstElement());
		System.out.println(stack.elementAt(2));
	}

}