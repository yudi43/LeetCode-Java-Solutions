/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

/*
1431. Kids With the Greatest Number of Candies

Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.

For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.



Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation:
Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest number of candies among the kids.
Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
Kid 3 has 5 candies and this is already the greatest number of candies among the kids.
Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies.
Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.

**/



//Approach: Unfortunately, we are using java here and are given with an array of numbers and not an arraylist. If it was an arraylist, we could
//find the max value using Collection.max but in this case we have to add another loop just to find the max value in the existing array.

//Analysis: Runtime: 0 ms, faster than 100.00% of Java online submissions for Kids With the Greatest Number of Candies.
//Memory Usage: 39.6 MB, less than 100.00% of Java online submissions for Kids With the Greatest Number of Candies.

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        //step 1: find the highest element in the array
        int highest = 0;
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i < candies.length; i++) if(candies[i] > highest) highest = candies[i];

        //step 2: add extraCandies to each element and check if the result is higher than the max value:
        for(int i = 0; i < candies.length; i++) result.add(candies[i] + extraCandies >= highest);
        return result;
    }
}
