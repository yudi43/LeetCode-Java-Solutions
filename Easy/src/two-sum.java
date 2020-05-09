import java.util.HashMap;

/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

//Thinking approach: It's given that there is only one solution to the problem, which means that only two numbers can add for result to be target.
//Traverse through the array and for each element check if the total of (target - thatItem) has appeared before that position.

class Solution {
    public int[] twoSum(int[] nums, int target) {

        //slower solution: for each element check if the total of (target - thatItem) has appeard before in the array, for that we use another while loop inside the for loop.
        //using two loops makes it a O(n^2) complexity solution.

        //Runtime: 21 ms, faster than 40.50% of Java online submissions for Two Sum.
        //Memory Usage: 39.6 MB, less than 5.65% of Java online submissions for Two Sum.

//        for(int i = 1; i < nums.length; i++) {
//            int tester = target - nums[i];
//            int j = i - 1;
//            while(j > -1) {
//                if(nums[j] == tester) return new int[]{j, i};
//                j--;
//            }
//        }
//        return new int[]{0};

        //A better solution: using hashmap, pushing values inside it and for each value checking if the number already exists in the hashmap.
//        Runtime: 1 ms, faster than 99.93% of Java online submissions for Two Sum.
//        Memory Usage: 39.4 MB, less than 5.65% of Java online submissions for Two Sum.
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tester = target - nums[i];
            if (hm.containsKey(tester)) {
                return new int[]{hm.get(tester), i};
            }
            hm.put(nums[i], i);
        }
        return new int[]{0};
    }
}