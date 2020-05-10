/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

/*
* 1295. Find Numbers with Even Number of Digits
    Given an array nums of integers, return how many of them contain an even number of digits.

    Example 1:

    Input: nums = [12,345,2,6,7896]
    Output: 2
    Explanation:
    12 contains 2 digits (even number of digits).
    345 contains 3 digits (odd number of digits).
    2 contains 1 digit (odd number of digits).
    6 contains 1 digit (odd number of digits).
    7896 contains 4 digits (even number of digits).
    Therefore only 12 and 7896 contain an even number of digits.
 */

/*
    There can be two solutions to this problem, they are different only by the approach of how you count the number of digits.
    Both the solutions give almost equal time and space complexity and hence I am attaching both.
 */

//First approach: Convert all items into string and the length of string is equal to how many digits are there..
//Analysis: Runtime: 1 ms, faster than 91.94% of Java online submissions for Find Numbers with Even Number of Digits.
//Memory Usage: 39.5 MB, less than 100.00% of Java online submissions for Find Numbers with Even Number of Digits.


class Solution {
    public int findNumbers(int[] nums) {
         int count = 0;
         for(int i = 0; i < nums.length; i++) {
             int currentNum = nums[i];
             if(String.valueOf(currentNum).length() % 2 == 0) count++;
         }
         return count;
    }
}

//Second approach: Find the number of digits looping through each item unless n/10 is greater than zero
//Analysis: Runtime: 1 ms, faster than 91.94% of Java online submissions for Find Numbers with Even Number of Digits.
//Memory Usage: 38.7 MB, less than 100.00% of Java online submissions for Find Numbers with Even Number of Digits.

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int currentCount = 0;

            while(currentNum > 0) {
                currentCount++;
                currentNum = currentNum/10;
            }
            if(currentCount % 2 == 0) count++;
        }
        return count;
    }
}