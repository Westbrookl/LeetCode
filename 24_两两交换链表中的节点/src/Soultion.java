/**
 * 
 * 
 * 
 * @author jhc
 * @version 1.0.0 ����汾ֻ�������ListNode�ڵ���ֻ��һ�����ֵ�ʱ����н������ݵ�����������������Ľ���
 * �ڵ�
 * �����Ľ����ڵ���汾2
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
