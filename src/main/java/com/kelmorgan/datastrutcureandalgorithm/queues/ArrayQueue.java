package com.kelmorgan.datastrutcureandalgorithm.queues;

import java.util.Arrays;

public class ArrayQueue {

    private int[] items;

    private int rear;
    private int front;
    private int count;


    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }


    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalStateException();

        items[rear] = item;

        rear = (rear + 1) % items.length;

        count++;
    }

    public int dequeue(){
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }


    @Override
    public String toString(){
        int[] content = Arrays.copyOfRange(items, 0, count);
        return  Arrays.toString(content);
    }

}
