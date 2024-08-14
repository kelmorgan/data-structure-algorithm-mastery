package com.kelmorgan.datastrutcureandalgorithm;


import com.kelmorgan.datastrutcureandalgorithm.queues.ArrayQueue;
import com.kelmorgan.datastrutcureandalgorithm.queues.QueueWithTwoStacks;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        QueueWithTwoStacks queue = new QueueWithTwoStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();
        queue.dequeue();
        var item = queue.peek();

        System.out.println(item);



    }

    public static  void reverse (Queue<Integer> queue){
        Stack<Integer> stack = new Stack();


        while (!queue.isEmpty())
            stack.add(queue.remove());

        while (!stack.empty())
            queue.add(stack.pop());


        System.out.println(queue);
    }
}
