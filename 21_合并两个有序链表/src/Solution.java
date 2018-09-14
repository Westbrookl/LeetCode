/*
 *首先是关于对有序链表进行排序的理解。
 *
 *如果节点不存在的时候，那么赋值就是为空 null
 *初始化节点要赋值，构造参数的原因。、
 *
 *其次是我们对于赋值和对于查找的理解
 *查找直接就是 list = list.next;
 *赋值则是 list.next = listNode;
 *
 *
 *还有就是 初始化多一个节点 我们始终想要在一个节点上就得让他一开始就向后移动一下。
 *初始化一个节点用来保存第一个节点的位置。
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
