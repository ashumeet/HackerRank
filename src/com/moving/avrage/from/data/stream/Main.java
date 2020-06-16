package com.moving.avrage.from.data.stream;

/*
Given a stream of integers and a window size,
calculate the moving average of all integers in the sliding window.

Example:
MovingAverage m = new MovingAverage(3);
m.next(1) = 1
m.next(10) = (1 + 10) / 2
m.next(3) = (1 + 10 + 3) / 3
m.next(5) = (10 + 3 + 5) / 3
*/

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        MovingAverage m = new MovingAverage(3);
        System.out.println(m.next(1));
        System.out.println(m.next(10));
        System.out.println(m.next(3));
        System.out.println(m.next(5));
    }
}

class MovingAverage {

    Queue<Integer> queue;
    int maxSize;
    double sum;

    public MovingAverage(int size) {
        queue = new LinkedList<>();
        maxSize = size;
        sum = 0.0;
    }

    public double next(int val) {
        if(queue.size() == maxSize) {
            sum -= queue.remove();
        }
        sum += val;
        queue.add(val);
        return sum/queue.size();
    }
}
