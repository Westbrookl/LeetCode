/**
 * 
 * 
 * 
 * @author jhc
 * @version 1.0.0 这个版本只是针对于ListNode节点中只有一个数字的时候进行交换内容但是这个并不是真正的交换
 * 节点
 * 真正的交换节点见版本2
 *
 */
public class Soultion {
	public ListNode SwapPairs(ListNode head){
		 ListNode firstNode = new ListNode(0);
		 firstNode.next = head;
		 if(head==null){
			 return null;
		 }
		 while(head!=null && head.next!=null){
			 int temp;
			 temp = head.next.val;
			 head.next.val = head.val;
			 head.val = temp;
			 head = head.next.next;
		 }
		 return firstNode.next;
	}
}
