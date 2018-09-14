/*
 *�����ǹ��ڶ�������������������⡣
 *
 *����ڵ㲻���ڵ�ʱ����ô��ֵ����Ϊ�� null
 *��ʼ���ڵ�Ҫ��ֵ�����������ԭ�򡣡�
 *
 *��������Ƕ��ڸ�ֵ�Ͷ��ڲ��ҵ����
 *����ֱ�Ӿ��� list = list.next;
 *��ֵ���� list.next = listNode;
 *
 *
 *���о��� ��ʼ����һ���ڵ� ����ʼ����Ҫ��һ���ڵ��Ͼ͵�����һ��ʼ������ƶ�һ�¡�
 *��ʼ��һ���ڵ����������һ���ڵ��λ�á�
 * 
 * 
 * 
 * 
 * 
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode l1,ListNode l2){
		ListNode listNode = new ListNode(0);
		ListNode firstNode = listNode;
		while(l1!=null && l2!=null){
			if(l1.val<=l2.val){
				listNode.next = l1;
				l1 = l1.next;
			}else{
				listNode.next = l2;
				l2 = l2.next;
			}
			listNode = listNode.next;
		}
		while(l1!=null){
			listNode.next = l1;
			l1 = l1.next;
			listNode = listNode.next;
		}
		while(l2!=null){
			listNode.next = l2;
			l2 = l2.next;
			listNode = listNode.next;
		}
		return firstNode.next;
		
	}
}
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		this.val = x;
	}
}
