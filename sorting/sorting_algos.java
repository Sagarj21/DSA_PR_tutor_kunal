package sorting;
//https://www.youtube.com/watch?v=JfinxytTYFQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=20
import java.util.Arrays;

public class sorting_algos {

	public static void main(String[] args) {

		int[] arr= {5,3,4,1,2,-1};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	//insertion sort  idea = for every index you are at put that element at the correct index at LHS
	static void insertionSort(int []arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j > 0; j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}else {
					break;
				}
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//selection sort
	static void selection(int []arr) {
		for(int i=0;i<arr.length;i++) {
			
			//find max item in the remaining array and swap with the correct index
			int last=arr.length-i-1;
			int maxIndex= getMaxIndex(arr,0,last);
			swap(arr,maxIndex,last);
			
		}
	}	
	static void swap(int[] arr,int first,int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
	static int getMaxIndex(int[] arr, int start, int end) {
		int max=start;
		for(int i=start;i<=end;i++) {
			if(arr[max]< arr[i]) {
				max=i;
			}
		}
		return max;
	}




	//bubble
	static void bubble(int []arr) {
		boolean swapped;
		
		//run the steps n-1 times
		for(int i=0;i<arr.length;i++) {
			swapped=false;
			//for each step max item will come at last respective index
			for(int j=1;j<arr.length-i;j++) {
				
				//swap if item is smaller than the previous item
				if(arr[j]<arr[j-1]) {
					//swap
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			//if you didnt swapped for particular value of i then it means that array is sorted adn stop the proram
			if(!swapped) {
				break;// !false give strue
			}
		}
		
	}
	
	
}