package Binary_search;

public class ceiling{

	public static void main(String[] args){
		int[] arr= {1,44,55,66,88,99,334,667,899,78989};
		int target=88;
		System.out.println(floor(arr, target));
		
	}
	
	//return index
	//-1 does not exists
	static int ceilingg(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			
			int mid= start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}else if(target>arr[mid]) {
				start=mid+1;
			}else {
				return arr[mid];
			}
		}
		return arr[start];
	}
	static int floor(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			
			int mid= start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}else if(target>arr[mid]) {
				start=mid+1;
			}else {
				return arr[mid];
			}
		}
		return arr[end];
	}
}


//opposite for floor of a number
