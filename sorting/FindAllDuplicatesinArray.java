package sorting;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
	
import java.util.ArrayList;
import java.util.List;

class FindAllDuplicatesinArray {
     	
	public static void main(String[] args) {
		int[] nums= {4,3,2,7,8,2,3,1};
		List<Integer> list= findDuplicates(nums);
		for(int i=0;i<list.size();i++){
		    System.out.println(list.get(i));
		}
	}
	
	
    public static List<Integer> findDuplicates(int[] arr) {
    	int i=0;
		while(i< arr.length) {
			int correct = arr[i]-1;
			if(arr[i] != arr[correct]) {
				swap(arr,i,correct);
			}else {
				i++;
			}
		}
		
		//searching for all duplicates
		List<Integer> allDuplicates = new ArrayList<Integer>();
	    for (int index = 0; index < arr.length; index++) {
			if(arr[index]!= index+1) {
				allDuplicates.add(arr[index]);
			}
		}
	    return allDuplicates;
    }
    
    
    
    static void swap(int[] nums, int first, int second) {
		int temp=nums[first];
		nums[first]=nums[second];
		nums[second]= temp;
	}
}