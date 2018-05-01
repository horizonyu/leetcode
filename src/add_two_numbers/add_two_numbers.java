package add_two_numbers;



public class add_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode nullNode = new ListNode(0);
		ListNode p = l1, q = l2;
		int carry = 0;
		ListNode curr = nullNode;
		//º¯ÊýÖ÷Ìå
		while(p != null || q != null){
			int intl1 = (p!=null)?p.val:0;
			int intl2 = (q!=null)?q.val:0;
			
			int sum = intl2+intl1+carry;
			carry=sum/10;
			curr.next = new ListNode(sum%10);
			curr = curr.next;
			
			if(p!=null)p=p.next;
			if(q!=null)q=q.next;	
		}
		if(carry > 0)
			curr.next = new ListNode(carry);
		
		return nullNode.next;
    }

}
