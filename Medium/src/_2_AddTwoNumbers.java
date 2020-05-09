/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//        Example:
//
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class _2_AddTwoNumbers {


//BRUTE FORCE/LESS EFFICIENT SOLUTION:
//Approach: Take values from each linked list and store them in a string builder and store the addition of their reversed values in another string variable (result in this case).
//Convert that string variable into an arraylist, reverse it and create another linked list with its values. Return the linked list.
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        StringBuilder sb1 = new StringBuilder();
//        StringBuilder sb2 = new StringBuilder();
//
//        while(l1 != null) {
//            sb1.append(l1.val);
//            l1 = l1.next;
//        }
//        while(l2 != null) {
//            sb2.append(l2.val);
//            l2 = l2.next;
//        }
//        sb1.reverse();
//        sb2.reverse();
//        String result = String.valueOf(new BigInteger(sb1.toString()).add( new BigInteger(sb2.toString())));
//        ArrayList<String> strarr = new ArrayList<>(Arrays.asList(result.split("")));
//        Collections.reverse(strarr);
//        ListNode resultNode = new ListNode(Integer.parseInt(strarr.get(0)));
//
//        ListNode head = resultNode;
//        for(int i = 1; i < strarr.size(); i++){
//            head.next = new ListNode(Integer.parseInt(strarr.get(i)));
//            head = head.next;
//        }
//
//        return resultNode;
//    }
}
