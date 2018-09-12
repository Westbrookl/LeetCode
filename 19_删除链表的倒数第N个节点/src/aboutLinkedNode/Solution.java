package aboutLinkedNode;

/*
 * @author jhc
 * @date 2018-9-12
 * 
 * ɾ��������n��������ɾ��������length-n+1����
 * ������������ListNode
 * p��q
 * P���������ߵ�n��λ���ж�p�Ƿ�Ϊ�����Ϊ�յĻ�����ô�;���ɾ��ͷ���
 * �����Ϊ�յĻ�
 * p����һ����㣬Ȼ����ѭ����p q ���߱���������ˡ�
 * ����ͷ��㼴�ɡ�
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
