package com.kelmorgan.datastrutcureandalgorithm.stacks;

import java.util.Stack;

public class StringReverser {

    public String reverse(String input){
        Stack<Character> stack = new Stack<>();

        if (input == null)
            throw  new IllegalArgumentException();

        for(char c : input.toCharArray())
            stack.push(c);


        StringBuilder reversed = new StringBuilder();

        while (!stack.empty())
            reversed.append(stack.pop());


        return reversed.toString();

    }
}
