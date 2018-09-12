package aboutLinkedNode;

/*
 * @author jhc
 * @date 2018-9-12
 * 
 * 删除倒数第n个数就是删除正数第length-n+1个数
 * 所以设置两个ListNode
 * p和q
 * P首先正数走到n的位置判断p是否为空如果为空的话，那么就就是删除头结点
 * 如果不为空的话
 * p多走一个结点，然后在循环中p q 都走便可以运行了。
 * 返回头结点即可。
 * 
 */
public class Solution {
	public ListNode removeNFromEnd(ListNode head,int n){
		ListNode p = head;
		ListNode q = head;
		for(int i=0;i<n;i++){
			p = p.next;
		}
		if(p==null){
			head = head.next;
			return head;
		}
		while(p.next!=null){
			p = p.next;
			q = q.next;
		}
		q.next = q.next.next;
		return head;
		
	}
}
