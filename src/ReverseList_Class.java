import java.util.Stack;

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
	 * 反转链表，把后面的节点换到前面，从头结点开始换
	 * @param head
	 * @return
	 */
	public static ListNode ReverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode reversedHead = null;
		//指向当前节点
		ListNode current = head;
		//转换目前到达的节点
		ListNode tmp = null;
		//新链表的头结点
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
	 * 使用stack实现链表反转
	 * @param head
	 * @return
	 */
	public static ListNode ReverseList2(ListNode head) {
		if (head==null) {
			return null;
		}
	    Stack stack = new Stack();	    
        ListNode in = head;
        ListNode out = null;
        while(in!=null){
            stack.push(in);
            in = in.next;
        }
        out=(ListNode)stack.pop();
        head=out;
        while(!stack.empty()){
            out.next=(ListNode)stack.pop();
            out = out.next;
        }
        out.next=null;
        return head;
    
	}
	
	/**
	 * 递归实现链表反转
	 * @param head
	 * @return
	 */
	public static ListNode ReverseList3(ListNode head) {
		//判断的临界条件非常巧妙
		if (head==null||head.next==null) {
			return head;
		}		
		//递归思想，先从最后一个开始反转
		//反转前节点时，先反转后节点
		ListNode nodeReverse=ReverseList3(head.next);
		
		//假设链表中只有两个节点的反转，就是这样的
		head.next.next=head;
		head.next=null;		
		
		return nodeReverse;    
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
		//printList(ReverseList(listNode1));	
		
		//printList(ReverseList2(listNode1));			
		
		printList(ReverseList3(listNode1));	
		
		
		
	}

}
