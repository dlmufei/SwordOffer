/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 * 
 * @author FEI
 * 
 */
public class  ReverseList_Class {

	/**
	 * 定义链表节点
	 * @author FEI
	 *
	 */
	public static class ListNode {
		int val;
		ListNode next = null;
		ListNode(int val) {
			this.val = val;
		}
	}

	/**
	 * 反转链表方法
	 * @param head
	 * @return
	 */
	public static ListNode ReverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode reversedHead = null;
		ListNode current = head;
		ListNode tmp = null;
		ListNode pre = null;
		while (current != null) {
			tmp = current.next;
			current.next = pre;
			if (tmp == null)
				reversedHead = current;
			pre = current;
			current = tmp;

		}
		return reversedHead;

	}
	/**
	 * 打印链表方法
	 * @param head
	 */
	public static void printList(ListNode head){
		if (head==null) {
			return;
		}		
		ListNode headTemp=head;
		while(headTemp!=null){
			System.out.print(headTemp.val+"->");
			headTemp=headTemp.next;
		}
		System.out.println("null");
	}
	

	public static void main(String[] args) {
		
		//构建测试数据
		ListNode listNode1=new ListNode(1);
		ListNode listNode2=new ListNode(2);
		ListNode listNode3=new ListNode(3);
		ListNode listNode4=new ListNode(4);
		ListNode listNode5=new ListNode(5);
		listNode1.next=listNode2;
		listNode2.next=listNode3;
		listNode3.next=listNode4;
		listNode4.next=listNode5;
		listNode5.next=null;
		//
		printList(listNode1);
		
		//反转以后打印
		printList(ReverseList(listNode1));	
		
	}

}
