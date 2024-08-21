package com.kelmorgan.datastrutcureandalgorithm.queues;

import java.util.Arrays;

public class PriorityQueue {


    private int[] items = new int[5];

    private int count;


    public void add(int item) {
        if (isFull())
            throw new IllegalStateException();

        int i = shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    private boolean isFull() {
        return count == items.length;
    }

    private int shiftItemsToInsert(int item) {
        int i;

        //shifting
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        return i + 1;
    }

    public int remove(){
        if (isEmpty())
            throw new IllegalStateException();

        return items[--count];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
