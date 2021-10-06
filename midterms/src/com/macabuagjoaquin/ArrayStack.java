package com.macabuagjoaquin;

import java.util.EmptyStackException;

public class ArrayStacj {
    private Player[] stack;
    private int top;

    public ArrayStacj(int capacity)
    {
        stack = new Player[capacity];
    }

    //the push adds
    public void push(Player player)
    {
        if (top == stack.length) // stack is full
        {
            Player[] newStack = new Player[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[top++] = player;
    }

    //the pop removes
    public Player pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Player poppedPlayer = stack[--top];
        stack[top] = null;
        return poppedPlayer;
    }

    //the peek accesses
    public Player peek()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }


    public boolean isEmpty()
    {
        return top == 0;
    }

    public void printStack()
    {
        for (int i = top - 1; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }
}