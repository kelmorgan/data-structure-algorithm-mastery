package com.kelmorgan.datastrutcureandalgorithm.stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBracket = Arrays.asList(')', '>', ']', '}');

    public boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()){
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.empty()) return false;

                char top = stack.pop();
                if (!bracketMatch(top, ch)) return false;
            }
        }


        return stack.empty();
    }

    private boolean bracketMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBracket.indexOf(right);
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBracket.contains(ch);
    }
}
