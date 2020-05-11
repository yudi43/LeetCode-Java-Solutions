/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

/*
    1290. Convert Binary Number in a Linked List to Integer
    Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

    Return the decimal value of the number in the linked list.

    Example 1:

    Input: head = [1,0,1]
    Output: 5
    Explanation: (101) in base 2 = (5) in base 10
 */

/*
*   Approach: Iterate through the linked list until you find null, while iterating keep appending the values to a string builder.
*   After complete traversal, parse the binary into a decimal using the parseInt method of the Integer class with radix of 2
* */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();

        while(head != null) {
            int currentInt = head.val;
            sb.append(currentInt);
            head = head.next;
        }
        return Integer.parseInt(sb.toString(), 2);

    }
}