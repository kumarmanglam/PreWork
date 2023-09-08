package om.pre;

public class Pattern {
	static void printPattern(int n) {
		for(int i = n; i>0; i--) {
			for(int j= 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		printPattern(5);
	}
}
