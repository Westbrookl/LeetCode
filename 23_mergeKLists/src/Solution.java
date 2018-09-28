class ListNode{
	int value;
	ListNode next;
	public ListNode(int x){
		this.value = x;
	}
}

public class Solution {
	 public ListNode mergeKLists(ListNode[] lists) {
	        int n = lists.length;
	        if(n<=0){
	        	return null;
	        }
	       
	        while(n>1){
	        	int k = (n+1)/2;
	        	for(int i=0;i<n/2;i++){
	        		lists[i] = mergerTwoList(lists[i],lists[i+k]);
	        	}
	        	n = k;
	        }
	        return lists[0];
	    }
	 
	 public ListNode mergerTwoList(ListNode l1,ListNode l2){
		 ListNode listNode = new ListNode(0);
		 ListNode firstNode = listNode;
		 while(l1!=null && l2!=null){
			 if(l1.value < l2.value){
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
