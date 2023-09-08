package om.pre;

public class Prime {
	static boolean checkPrime(int n) {
		int mid = n/2;
		int i = 2;
		if(n<2) {
			return false;
		}
		while (i < mid) {
			if(n%i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(checkPrime(9991411));
	}
}
