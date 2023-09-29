package Number_sys;
//find a digit which comes only once in array wheras all other comes twice

//can be solved by XOR ing the array
//XOR all the unmbers   o(1) time complexity   and constant space complexity

public class Find_unique {

	public static void main(String[] args) {
		int[] arr= {2,3,3,4,2,6,6,4};
		System.out.println(ans(arr));
	}
	
	private static int ans(int[] arr) {
		int unique=0;
		
		for(int n:arr) {
			unique ^=n;
		}
		return unique;
	}
}
