/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

/*
160. Intersection of Two Linked Lists

Write a program to find the node at which the intersection of two singly linked lists begins.
* Exmple at: https://assets.leetcode.com/uploads/2018/12/13/160_statement.png
* */

//Approach: Traverse both the lists at the same time and when you reach the end of one list, point it to the head of another list.
//Analysis: Runtime: 1 ms, faster than 98.03% of Java online submissions for Intersection of Two Linked Lists.
//Memory Usage: 42.4 MB, less than 5.71% of Java online submissions for Intersection of Two Linked Lists.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listA = headA;
        ListNode listB = headB;


        while(listA != listB) {
            if(listA == null && listB == null) {
                return null;
            }
            if(listA == null) {
                listA = headB;
            }else{
                listA = listA.next;
            }

            if(listB == null) {
                listB = headA;
            }else{
                listB = listB.next;
            }
        }

        return listA;
    }
}