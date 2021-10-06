package com.macabuagjoaquin;

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
	// write your code here

        CardStack myDeck = new CardStack();
        CardStack hand = new CardStack();
        CardStack discardedPile = new CardStack();

        //Instantiating the 30 cards...
        Card card1 = new Card(1, "Blue Jeans and Bloody Tears");
        Card card2 = new Card(2, "Stay With Me");
        Card card3 = new Card(3, "STAND PROUD");
        Card card4 = new Card(4, "All Star");
        Card card5 = new Card(5, "Never Gonna Give You Up");
        Card card6 = new Card(6, "Starless Sky");
        Card card7 = new Card(7, "Il Vento D'oro" );
        Card card8 = new Card(8, "Take On Me");
        Card card9 = new Card(9, "Wagakkiband");
        Card card10 = new Card(10, "Omega Rhythm");
        Card card11 = new Card(11, "Baby Shark");
        Card card12 = new Card(12, "Thriller");
        Card card13 = new Card(13, "Wait For You");
        Card card14 = new Card(14, "Fly Me to The Moon");
        Card card15 = new Card(15, "Moon River");
        Card card16 = new Card(16, "LadyBaby");
        Card card17 = new Card(17, "STAY");
        Card card18 = new Card(18, "CHICKEN");
        Card card19 = new Card(19, "Heartbeat");
        Card card20 = new Card(20, "Nothing's Gonna Stop Us");
        Card card21 = new Card(21, "Deja Vu");
        Card card22 = new Card(22, "Running For The Fame");
        Card card23 = new Card(23, "Lone Digger");
        Card card24 = new Card(24, "Star Platinum");
        Card card25 = new Card(25, "Pretender");
        Card card26 = new Card(26, "I Need A Hero");
        Card card27 = new Card(27, "Ai No Scenario");
        Card card28 = new Card(28, "Pika Girl");
        Card card29 = new Card(29, "MTC");
        Card card30 = new Card(30, "Silhouette");

        //Pls make a function to push these cards
        myDeck.push(card1);
        myDeck.push(card2);
        myDeck.push(card3);
        myDeck.push(card4);
        myDeck.push(card5);
        myDeck.push(card6);
        myDeck.push(card7);
        myDeck.push(card8);
        myDeck.push(card9);
        myDeck.push(card10);
        myDeck.push(card11);
        myDeck.push(card12);
        myDeck.push(card13);
        myDeck.push(card14);
        myDeck.push(card15);
        myDeck.push(card16);
        myDeck.push(card17);
        myDeck.push(card18);
        myDeck.push(card19);
        myDeck.push(card20);
        myDeck.push(card21);
        myDeck.push(card22);
        myDeck.push(card23);
        myDeck.push(card24);
        myDeck.push(card25);
        myDeck.push(card26);
        myDeck.push(card27);
        myDeck.push(card28);
        myDeck.push(card29);
        myDeck.push(card30);

        myDeck.printStack();

        //myDeck.push(card1); //Adds a card to the deck
        //hand.push(myDeck.pop()); //transfers the top-most card from the deck to the hand
        //discardedPile.push(hand.pop()); //transfers the top most card from your hand to the discarded pile


    }
}
