package com.first.bad.version;

/*
You are a product manager and currently leading a team to develop a new product.
Unfortunately, the latest version of your product fails the quality check.
Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad.
Implement a function to find the first bad version. You should minimize the number of calls to the API.

Example:
Given n = 5, and version = 4 is the first bad version.
call isBadVersion(3) returns false
call isBadVersion(5) returns true
call isBadVersion(4) returns true
Then 4 is the first bad version.
*/

public class Main {
    public static void main(String[] args) {
        Solution.badVersion = 4;
        System.out.println(Solution.firstBadVersion(7));
        Solution.badVersion = 6;
        System.out.println(Solution.firstBadVersion(10));
        Solution.badVersion = 4;
        System.out.println(Solution.firstBadVersion(20));
        Solution.badVersion = 7;
        System.out.println(Solution.firstBadVersion(7));
    }

}

class VersionControl {
    public static int badVersion;
    public static boolean isBadVersion(int version) {
        return badVersion <= version;
    }
}

class Solution extends VersionControl{
    public static int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}
