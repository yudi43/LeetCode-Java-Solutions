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

//Efficient solution:
//Approach: There is no need to convert the linked lists and reverse them to add then get the value.
//If you directly start adding the items as you go ahead in both the linked lists, what you get is the result.
//    Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.
//    Memory Usage: 39.5 MB, less than 99.69% of Java online submissions for Add Two Numbers.

        ListNode resultList = new ListNode();
        ListNode head = resultList;
        boolean carry = false;
        while(l1 != null || l2 != null) {
            int sum = 0;
            if(l1 == null) {
                sum += l2.val;
                l2 = l2.next;
            }else if(l2 == null) {
                sum += l1.val;
                l1 = l1.next;
            }else{
               sum += l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            if(carry) {
                sum += 1;
            }
            if(sum > 9) {
                carry = true;
                sum = sum % 10;
            }else{
                carry = false;
            }
            head.next = new ListNode(sum);
            head = head.next;
        }
        if(carry) {
            head.val = head.val % 10;
             head.next = new ListNode(1);
        }
        return resultList.next;

//BRUTE FORCE/LESS EFFICIENT SOLUTION:
//Approach: Take values from each linked list and store them in a string builder and store the addition of their reversed values in another string variable (result in this case).
//Convert that string variable into an arraylist, reverse it and create another linked list with its values. Return the linked list.
//    Runtime: 19 ms, faster than 5.36% of Java online submissions for Add Two Numbers.
//    Memory Usage: 40.3 MB, less than 99.06% of Java online submissions for Add Two Numbers.

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
//        return resultNode;
//    }
}
