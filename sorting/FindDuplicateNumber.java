package sorting;
//https://www.youtube.com/watch?v=JfinxytTYFQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=20
//https://leetcode.com/problems/find-the-duplicate-number/
import java.util.Arrays;

class FindDuplicateNumber {
	
	
	public static void main(String[] args) {
		int[] arr= {3,5,2};
		
		System.out.println(findDuplicate(arr));

	}
	
	public static int findDuplicate(int[] arr) {
		
    	int i=0;
		while(i< arr.length) {
			
			if(arr[i] != i+1) {
				int correct = arr[i]-1;
				if(arr[i] != arr[correct]) {
					swap(arr,i,correct);
				}else {
					return arr[i];
				}
			}else {
				i++;
			}
		}
		return arr.length;
    }
	//swapping 
	static void swap(int[] arr, int first, int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]= temp;
	}
}