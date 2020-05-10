/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

/*1313. Decompress Run-Length Encoded List
We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.

Return the decompressed list.

Example 1:

Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
*/


/*
* Approach: We will need two loops, out loop will keep a track of where we are and which value is freq and which is val.
* The other/inner loop will fill the values accordingly in another resultant list.
*
* Analysis: Runtime: 3 ms, faster than 54.99% of Java online submissions for Decompress Run-Length Encoded List.
* Memory Usage: 40.1 MB, less than 100.00% of Java online submissions for Decompress Run-Length Encoded List.
* */

class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int value = nums[i+1];
            for(int j = 0; j < freq; j++) {
                result.add(value);
            }
        }
        int[] resultArr = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }
}