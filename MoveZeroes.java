import java.util.*;

// Move Zeroes
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

public class MoveZeroes
{
	public static void main(String[] args) {

        int[] nums = {12,15,0,8,0,21,0,14,0,5,9,25,0,10};
        
        int i = 0;
        
        for (int num:nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }
        
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
        
        System.out.println(Arrays.toString(nums));
        

	}
}
