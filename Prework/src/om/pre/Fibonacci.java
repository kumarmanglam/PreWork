package om.pre;

public class Fibonacci {
	static int[] arr ;
	static int fibonacci(int n) {
		if(n<2) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	
	public static void main(String[] args) {
		for(int i=0; i<8; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
}
