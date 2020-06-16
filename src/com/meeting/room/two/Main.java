package com.meeting.room.two;

/*

 */

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.minMeetingRooms(new Interval[] {
                new Interval(0, 30),
                new Interval(5, 10),
                new Interval(15, 20)
        }));
        System.out.println(Solution.minMeetingRooms(new Interval[] {
                new Interval(7, 10),
                new Interval(2, 4)
        }));
    }
}

class Solution {
    public static int minMeetingRooms(Interval[] intervals) {
        Arrays.sort(intervals, (a, b) -> a.start - b.start);
        PriorityQueue<Interval> minHeap = new PriorityQueue<>((a, b) -> a.end - b.end);
        return 0;
    }
}

class Interval {
    int start;
    int end;
    Interval() {
        start = 0;
        end = 0;
    }
    Interval(int s, int e) {
        start = s;
        end = e;
    }
}
