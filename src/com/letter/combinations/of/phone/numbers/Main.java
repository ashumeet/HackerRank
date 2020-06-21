package com.letter.combinations.of.phone.numbers;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations
that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.
Note that 1 does not map to any letters.

Example:
Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

Note: Although the above answer is in lexicographical order, your answer could be in any order you want.

Intuition behind solution: Create a mapping for digits to letters (i.e. 2 represent the letters a, b, and c).
Call a recursive function to populate or letter combinations. Pass the recursive function our array list
(result) that holds all our completed combinations, the numbers we're given, the mapping from numbers to letters,
the current index we are on, and a string representing our current combination.
Inside each recursive call, check if we have traversed all the digits we are given (index == digits.length()),
if we have, add the current combination to our result and return to ensure we don't continue.
Otherwise, get the letter mapping for the current digit we're on given by (mapping[digits.charAt(i) - '0').
Iterate through each possible letter that the current digit represents and at each iteration pass
to the next recursive call letters[i], updating our representation of our
current combination (current + letters[i]) and our index (index + 1).
Once all the recursive calls terminate, we have successfully generated all possible letter
combinations so we return result.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.result("23")));
    }
}

class Solution {
    public static String[] result(String digits) {
        List<String> result = new ArrayList<>();
        String[] maping = new String[] {
                "0",
                "1",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"

        };

        return result.toArray(new String[result.size()]);
    }

}
/*
234
abc
def
ghi

adg, adh, adi,

 */