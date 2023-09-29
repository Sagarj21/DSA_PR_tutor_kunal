package Number_sys;

public class ODdorEven {

	public static void main(String[] args) {
		int n=66;
		System.out.println(isOdd(n));
	}
	private static boolean isOdd(int n) {
		return (n&1)==1;
	}
}
