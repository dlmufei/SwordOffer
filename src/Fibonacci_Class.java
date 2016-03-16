
public class Fibonacci_Class {
	//递归实现
	public static int Fibonacci(int n) {
		if (n<1) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		else if (n==2) {
			return 1;
		}
		else {
			return Fibonacci(n-1)+Fibonacci(n-2);
		}
		
    }
	//迭代实现
	public static int Fibonacci1(int n) {
		if(n==0){
            return 0;
        }
        else if (n==1) {
			return 1;
		}
		else if (n==2) {
			return 1;
		}
		
		int n1=1;
		int n2=1;
		int n3=2;
		for (int i = 0; i < n-2; i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		return n3;
		
    }
	
	
	public static void main(String[] args) {
		System.out.println(Fibonacci(50));
	}

}
