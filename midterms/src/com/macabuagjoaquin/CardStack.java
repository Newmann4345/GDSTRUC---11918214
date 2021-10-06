package com.macabuagjoaquin;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack
{
    private LinkedList<Card> stack = new LinkedList<Card>();

    public CardStack()
    {
        stack = new LinkedList<Card>();
    }

    public void push(Card card)
    {
        stack.push(card);
    }

    public Card pop()
    {
        return stack.pop();
    }

    public Card peek()
    {
        return stack.peek();
    }

    public void printStack()
    {
        ListIterator<Card> iterator = stack.listIterator();

        System.out.println("Printing stack: ");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
