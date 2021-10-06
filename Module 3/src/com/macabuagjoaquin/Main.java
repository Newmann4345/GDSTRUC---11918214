package com.macabuagjoaquin;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //the last one in the stack becomes the one on top
        ArrayStack stack = new ArrayStack(5);

        stack.push(new Player(1, "aceu", 100));
        stack.push(new Player(2, "Sinatraa", 100));
        stack.push(new Player(3, "Subroza", 95));
        stack.push(new Player(4, "ploo", 90));

        //stack.printStack();

        System.out.println("\nPopping " + stack.pop() + "\n");

        stack.printStack();
    }
}
