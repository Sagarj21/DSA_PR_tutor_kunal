package Binary_search;

public class BinarySearch{

	public static void main(String[] args){
		int[] arr= {1,44,55,66,88,99,334,667,899,78989};
		int target=1;
		int ans=binarySearch(arr,target);
		System.out.println(ans);
	}
	
	//return index
	//-1 does not exists
	static int binarySearch(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			//find middle element
			//int mid= (start+end)/2; //might benpossinle that start +end will exceed range pf int
			int mid= start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}else if(target>arr[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
