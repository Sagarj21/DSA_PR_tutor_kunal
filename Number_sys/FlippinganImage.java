package Number_sys;
//https://leetcode.com/problems/flipping-an-image/
//https://www.youtube.com/watch?v=fzip9Aml6og&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=25
class FlippinganImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row:image) {
        	//reverse this array 
        	for (int i = 0; i < (image[0].length+1)/2; i++) {
				//swap and take xor
        		int temp=row[i]^1;
        		row[i]=row[image[0].length-i-1]^1;
        		row[image[0].length-i-1]=temp;
			}
        }
        return image;
    }
}