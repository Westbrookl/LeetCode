
public class Solution2 {
	public ListNode swapPairs(ListNode head){
		ListNode l = head;
		ListNode r = head.next;
		if(head==null || head.next==null){
			return head;
		}
		l.next = r.next;
		r.next = l;
		head = r;
		ListNode p = l;
		while(l.next!=null && l.next.next!=null){
			l = l.next;
			r= l.next;
			l.next = r.next;
			r.next = l;
			p.next = r;
			p = l;
		}
		return head;
	}
}
