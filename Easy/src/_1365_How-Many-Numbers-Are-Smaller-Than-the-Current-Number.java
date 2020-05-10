/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

/*
1365. How Many Numbers Are Smaller Than the Current Number
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.



Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation:
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1).
For nums[3]=2 there exist one smaller number than it (1).
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
* */

//Approach: Brute force solution approach should be to loop through the array and for each element, loop again and count how many numbers satisfy the condition.
//Analysis: Runtime: 14 ms, faster than 22.03% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
//Memory Usage: 39.5 MB, less than 100.00% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(j != i && nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
