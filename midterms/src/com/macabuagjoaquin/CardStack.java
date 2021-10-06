package com.macabuagjoaquin;

import java.util.LinkedList;

public class CardStack {
    private LinkedList<Card> stack = new LinkedList<Card>();

    public void push(Card card)
    {
        stack.push(card);
    }
}
