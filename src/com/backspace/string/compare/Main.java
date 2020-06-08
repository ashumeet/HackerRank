package com.backspace.string.compare;

/*
Given two strings S and T,
return if they are equal when both are typed into empty text editors.
# means a backspace character.

Example 1:
Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".

Example 2:
Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".

Example 3:
Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".

Example 4:
Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".

Note:
1. S.length will be between 1 and 200 inclusive
2. T.length will be between 1 and 200 inclusive
3. S and T only contain lowercase letters and '#' characters.

Follow up:
Can you solve it in O(N) time and O(1) space?
*/

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.backspaceCompare("ab#c", "ad#c"));
        System.out.println(Solution.backspaceCompare("ab##", "c#d#"));
        System.out.println(Solution.backspaceCompare("a##c", "#a#c"));
        System.out.println(Solution.backspaceCompare("a#c", "b"));
    }
}

class Solution {
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for (char s : S.toCharArray()) {
            if (s == '#') if (!sStack.isEmpty()) sStack.pop();
            else sStack.push(s);
        }
        for (char t : T.toCharArray()) {
            if (t == '#') if (!tStack.isEmpty()) tStack.pop();
            else tStack.push(t);
        }

        if (sStack.size() != tStack.size()) return false;
        while (!sStack.isEmpty()) if (sStack.pop() != tStack.pop()) return false;
        return true;
    }
}
