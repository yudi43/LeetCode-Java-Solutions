/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */


/*
*   1281. Subtract the Product and Sum of Digits of an Integer
*
*Given an integer number n, return the difference between the product of its digits and the sum of its digits.


Example 1:

Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
*
*
*
* */


/*
* IMPORTANT NOTE: There can be two ways in which you can find the digits of a given number.
* Way1: Convert them to an array of String using the split method and parse them one by one into integer.
* Way2: (Better/faster way): Run a loop until the number (n) is greater than zero and for each iteration, get the last digit using % operator and convert the number into n/10
* */


//First, the efficient solution:
//Analysis: Runtime: 0 ms, faster than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
//Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.

class Solution {
    public int subtractProductAndSum(int n) {
        int add = 0;
        int product = 1;

        while(n > 0) {
            int digit = n % 10; //gives the last digit of the number
            add += digit;
            product *= digit;
            n = n/10;
        }
        return product - add;
    }
}




//Non, efficient solution (way 1):
//Analysis: Runtime: 2 ms, faster than 8.41% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
//Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.

//class Solution {
//    public int subtractProductAndSum(int n) {
//        String[] digitsArray = String.valueOf(n).split("");
//        int product = 1;
//        int sum = 0;
//
//        for(String item : digitsArray) {
//            product = product * Integer.parseInt(item);
//            sum = sum + Integer.parseInt(item);
//        }
//        return product - sum;
//    }
//}
