package easy;
/*
53. Maximum Subarray
Medium

25089

1156

Add to List

Share
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
Runtime: 2 ms, faster than 75.66% of Java online submissions for Maximum Subarray.
Memory Usage: 73.1 MB, less than 77.56% of Java online submissions for Maximum Subarray.
Used Kadane's algorithm for finding max subarray
 */
public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = -99999;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
