package aboutLinkedNode;

public class Test {
	public static void main(String[] args){
		SingleLinkedList sll = new SingleLinkedList();
		sll.addHead("A");
		sll.addHead("B");
		sll.addHead("C");
		sll.addHead("D");
		sll.display();
		
		sll.delete("B");
		sll.display();
		
		System.out.println(sll.find("C"));
	}
}
