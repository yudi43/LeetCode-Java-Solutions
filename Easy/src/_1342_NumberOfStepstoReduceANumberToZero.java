/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

/*
*
* 1342. Number of Steps to Reduce a Number to Zero
* Given a non-negative integer num, return the number of steps to reduce it to zero. If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
Example 1:

Input: num = 14
Output: 6
Explanation:
Step 1) 14 is even; divide by 2 and obtain 7.
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3.
Step 4) 3 is odd; subtract 1 and obtain 2.
Step 5) 2 is even; divide by 2 and obtain 1.
Step 6) 1 is odd; subtract 1 and obtain 0.
*
* */


//Approach: The brute force solution for this problem would be to check if a number is even or odd, put it in a loop while the num is zero, and keep a track of steps using some variable
//A better solution would be to have a recursive solution, make this function call itself until the num is 0:

//Analysis: Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Steps to Reduce a Number to Zero.
//Memory Usage: 37.7 MB, less than 100.00% of Java online submissions for Number of Steps to Reduce a Number to Zero.

class Solution {
    public int numberOfSteps (int num) {
        if(num == 0) return 0;
        if(num % 2 == 0) return 1 + numberOfSteps(num / 2);
        else return 1 + numberOfSteps(num - 1);
    }
}