/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */


/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".



Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

********************************************************************************

This problem tests candidate's regex skills, the first thought that should come to mind is to return a
string with all "." replaced by "[.]" using the replaceAll method.

Key thing to keep in mind is that you can't pass "." directly in the replaceAll function as "." means something else (it will match with every character and will replace all the characters in the string).
You need to know how to escape a character in regex, answer is \\.

Runtime: 2 ms, faster than 27.32% of Java online submissions for Defanging an IP Address.
Memory Usage: 37.6 MB, less than 100.00% of Java online submissions for Defanging an IP Address.
*/

class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
