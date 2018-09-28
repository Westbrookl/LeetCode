
public class Solution {
	public static ListNode reverse(ListNode head, int k){
        int count = 0;
        ListNode currentNode = head;
        while (currentNode != null && count < k){
            currentNode = currentNode.next;
            count++;
        }
        while (count-- > 0) {
            ListNode tmp = head.next;
            head.next = currentNode;
            currentNode = head;
            head = tmp;
            ListNode out = currentNode;
            while (out != null){
                System.out.print(out.val + " ");
                out = out.next;
            }
            System.out.println();
        }
        return currentNode;
    }
    public static void main(String[] args){
       

        // ��ʼ��5������ڵ�
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        ListNode head4 = new ListNode(5);

        // ��ӽڵ��Ĺ�����ϵ
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;

        // ��ǰ�ĸ��ڵ���з�ת
        ListNode reverse = reverse(head, 2);
        
    }
}
