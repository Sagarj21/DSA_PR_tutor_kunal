package sorting;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-numsay/
//asked in google
//https://www.youtube.com/watch?v=JfinxytTYFQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=20
import java.util.ArrayList;
import java.util.List;

class DisapperedNumbersInnumsay {
	
	public static void main(String[] args) {
		int[] nums= {2,1,8};
		List<Integer> list= findDisappearedNumbers(nums);
		for(int i=0;i<list.size();i++){
		    System.out.println(list.get(i));
		}
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		int i=0;
		
		while(i< nums.length) {
			int correct = nums[i]-1;
			if(nums[i] != nums[correct]) {
				swap(nums,i,correct);
			}else {
				i++;
			}
		}
		
		//search for  missing number
		List<Integer> missingNumbers = new ArrayList<Integer>();
		for (int index = 0; index < nums.length; index++) {
			if(nums[index] != index+1) {
				missingNumbers.add(index+1);
			}
		}
			
		//case 2
		return missingNumbers;	
	}

	static void swap(int[] nums, int first, int second) {
		int temp=nums[first];
		nums[first]=nums[second];
		nums[second]= temp;
	}
}