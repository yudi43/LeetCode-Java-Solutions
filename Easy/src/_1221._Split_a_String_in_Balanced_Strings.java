/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */


/*
    1221. Split a String in Balanced Strings
    Balanced strings are those who have equal quantity of 'L' and 'R' characters.

    Given a balanced string s split it in the maximum amount of balanced strings.

    Return the maximum amount of splitted balanced strings.

    Example 1:
    Input: s = "RLRRLLRLRL"
    Output: 4
    Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

    Example 2:
    Input: s = "RLLLLRRRLR"
    Output: 3
    Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
*/


//Approach: The problem can be solved using stacks, by pushing and popping characters based on if it 'L' or 'R'. A simpler and more readable
//solution would be to keep a track if it being balanced or not is by using counters.
//Analysis: Runtime: 1 ms, faster than 18.35% of Java online submissions for Split a String in Balanced Strings.
//Memory Usage: 38.6 MB, less than 100.00% of Java online submissions for Split a String in Balanced Strings.
class Solution {
    public int balancedStringSplit(String s) {
        int result = 0;
        int currentCount = 0;
        for(int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            if(currentCharacter == 'L') { //if it is 'L' then increase the value of counter by 1
                currentCount++;
            }else if(currentCharacter == 'R'){ //if it is'R' then decrease the value of counter by 1
                currentCount--;
            }
            if(currentCount == 0) { //if it is zero at any iteration means that we have found one balanced string.
                result++;
            }
        }
        return result;
    }
}
