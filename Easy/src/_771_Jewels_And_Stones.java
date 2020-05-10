/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */


/*
* 771. Jewels and Stones
*
* You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:
Input: J = "aA", S = "aAAbbbb"
Output: 3
*
*
* */

//Approach, loop through the stones and for each store check that if it exists in the Jewels string.

//Analysis: Runtime: 0 ms, faster than 100.00% of Java online submissions for Jewels and Stones.
//Memory Usage: 37.8 MB, less than 5.05% of Java online submissions for Jewels and Stones.

class Solution {
    public int numJewelsInStones(String J, String S) {
        int counter = 0;
        for(int i = 0; i < S.length(); i++) {
            if(J.indexOf(S.charAt(i)) > -1) counter++; //increase the counter if the store is there in the string J
        }
        return counter;
    }
}
