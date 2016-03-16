import java.util.Stack;
import java.lang.Integer;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author FEI
 *
 */
public class StackToQueue_Class {
	
	static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();
    
    public static void push(int node) {
        stack1.push(node);
    }
    
    public static int pop() {
    	
    	//特别注意：当2不为空的时候是不能往里面压入数据的
    	if (stack2.empty()) {
			while(!stack1.empty()){
				stack2.push(stack1.pop());
			}
		}
    	if (stack2.empty()) {
			System.out.println("stack is empty!");
		}
    	
    	return stack2.pop();
    
    }
    
    public static void main(String[] args) {
		System.out.println("123");
	}

}
