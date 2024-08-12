package com.kelmorgan.datastrutcureandalgorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

    private int[] array;

    private int count = 0;


    public Array(int length) {
        this.array = new int[length];
    }


    public void insert(int item) {
        if (array.length == count) {
            int[] temp = new int[count * 2];

            for (int i = 0; i < count; i++) {
                temp[i] = array[i];
            }
            array = temp;

        }

        array[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("Invalid Index");


        for (int i = index; i < count; i++) {
            array[i] = array[i + 1];
        }

        count--;

    }


    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (array[i] == item)
                return i;


        return -1;
    }


    public int getCount() {
        return count;
    }

    public void print() {
     for (int i = 0; i < count; i++)
            System.out.println(array[i]);
    }
}
