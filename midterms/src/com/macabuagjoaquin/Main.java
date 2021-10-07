package com.macabuagjoaquin;

import com.sun.source.tree.IfTree;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
         Scanner pause = new Scanner(System.in);
	// write your code here
        //Generating the random class
        Random rand = new Random();
        //Declaring the random value
        int rng = 1;

        //Creating The Hand, The Player Deck, and the Discarded Pile
        CardStack myDeck = new CardStack();
        CardStack hand = new CardStack();
        CardStack discardedPile = new CardStack();

        //Instantiating ALL the 30 cards...
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

    //HOMAYGAWD PLEASE I WANT THIS TO TURN INTO A FUNCTION
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

        //TESTING
       //hand.push(card23);
       //hand.push(card24);
       //hand.push(card25);
       //hand.push(card21);
       //hand.push(card22);

       //discardedPile.push(hand.pop());
       //discardedPile.push(hand.pop());
       //discardedPile.push(hand.pop());

       //System.out.println("");
       //System.out.print("\nMYDECK ");
       //myDeck.printStack();
       //System.out.print("\nHAND ");
       //hand.printStack();
       //System.out.print("\nDISCARDED ");
       //discardedPile.printStack();


        //The loop will end when the Player deck is empty
      while (myDeck.peek() != null)
     {
         //random commands for player
         rng = rand.nextInt(1 + 3);
         if (rng == 0)
         {
             rng = 1;
         }

         //DRAWING FROM DECK
         if (rng == 1)
         {
             if (myDeck.peek() != null)
             {
                 //making sure the amount of cards drawn isn't 0
                 int random = 1;
                 random = rand.nextInt(1 + 5);
                 if (random == 0)
                 {
                     random = 1;
                 }

                 //transfers the top-most card from the deck to the hand
                 for (int i = random - 1; i >= 0; i--)
                 {
                     hand.push(myDeck.pop());
                 }
                 System.out.print("\nDRAWING ");

                 //Printing of cards
                 System.out.println("");
                 if (myDeck.peek() != null)
                 {
                     System.out.print("\nMYDECK ");
                     myDeck.printStack();
                 }
                 else if (myDeck.peek() == null)
                 {
                     System.out.print("DECK EMPTY");
                 }
                 else
                 {
                     System.out.print("DECK EMPTY");
                 }

                 if (hand.peek() != null)
                 {
                     System.out.print("\nHAND ");
                     hand.printStack();
                 }
                 else if (myDeck.peek() == null)
                 {
                     System.out.print("HAND EMPTY");
                 }
                 else
                 {
                     System.out.print("HAND EMPTY");
                 }

                 if (discardedPile.peek() != null)
                 {
                     System.out.print("\nDISCARDED PILE ");
                     discardedPile.printStack();
                 }
                 else if (hand.peek() == null)
                 {
                     System.out.print("\nDISCARDED PILE IS EMPTY");
                 }
                 else
                 {
                     System.out.print("\nDISCARDED PILE IS EMPTY");
                 }
             }
             else if (myDeck.peek() == null)
             {
                 break;
             }
             else
             {
                 System.out.print("DECK IS EMPTY");
             }
         }
         //DISCARDING CARDS
         else if (rng == 2)
         {
             if (hand.peek() != null)
             {
                 System.out.println("DISCARDING CARDS \n");
                 while (hand.peek() != null)
                 {
                     discardedPile.push(hand.pop());
                 }
                 //Printing of cards
                 System.out.println("");
                 if (myDeck.peek() != null)
                 {
                     System.out.print("\nMYDECK ");
                     myDeck.printStack();
                 }
                 else if (myDeck.peek() == null)
                 {
                     System.out.print("DECK EMPTY");
                 }
                 else
                 {
                     System.out.print("DECK EMPTY");
                 }

                 if (hand.peek() != null)
                 {
                     System.out.print("\nHAND ");
                     hand.printStack();
                 }
                 else if (hand.peek() == null)
                 {
                     System.out.print("HAND EMPTY");
                 }
                 else
                 {
                     System.out.print("HAND EMPTY");
                 }

                 if (discardedPile.peek() != null)
                 {
                     System.out.print("\nDISCARDED PILE ");
                     discardedPile.printStack();
                 }
                 else if (discardedPile.peek() == null)
                 {
                     System.out.print("\nDISCARDED PILE IS EMPTY");
                 }
                 else
                 {
                     System.out.print("\nDISCARDED PILE IS EMPTY");
                 }
             }
             else if (hand.peek() == null)
             {
                 System.out.print("HAND EMPTY");
             }
             else
             {
                 System.out.print("HAND EMPTY");
             }
         }
         //DRAWING FROM PILE
         else if (rng == 3)
         {
             if (discardedPile.peek() != null)
             {
                 System.out.println("\n DRAWING CARDS FROM THE DISCARDED PILE \n");
                 //making sure the amount of cards drawn isn't 0
                 int random = 1;
                 random = rand.nextInt(1 + 5);
                 if (random == 0) {
                     random = 1;
                 }

                 //transfers the top-most card from the deck to the hand
                 for (int i = random - 1; i >= 0; i--) {
                     //discardedPile.push(hand.pop()); //transfers the top most card from your hand to the discarded pile
                     hand.push(discardedPile.pop());
                 }
                 //Printing of cards
                 System.out.println("");
                 if (myDeck.peek() != null)
                 {
                     System.out.print("\nMYDECK ");
                     myDeck.printStack();
                 }
                 else if (myDeck.peek() == null)
                 {
                     System.out.print("DECK EMPTY");
                 }
                 else
                 {
                     System.out.print("DECK EMPTY");
                 }

                 if (hand.peek() != null)
                 {
                     System.out.print("\nHAND ");
                     hand.printStack();
                 }
                 else if (hand.peek() == null)
                 {
                     System.out.print("HAND EMPTY");
                 }
                 else
                 {
                     System.out.print("HAND EMPTY");
                 }

                 if (discardedPile.peek() != null)
                 {
                     System.out.print("\nDISCARDED PILE ");
                     discardedPile.printStack();
                 }
                 else if (discardedPile.peek() == null)
                 {
                     System.out.print("\nDISCARDED PILE IS EMPTY");
                 }
                 else
                 {
                     System.out.print("\nDISCARDED PILE IS EMPTY");
                 }
             }
             else if (discardedPile.peek() == null)
             {
                 System.out.println("DISCARDED PILE EMPTY");
             }
             else
             {
                 System.out.print("PILE IS EMPTY");
             }
         }
         pause.nextLine();
         System.out.println("\n\n\n\n\n\n");
     }


        //NOTES
        //myDeck.push(card1); //Adds a card to the deck
        //hand.push(myDeck.pop()); //transfers the top-most card from the deck to the hand
        //discardedPile.push(hand.pop()); //transfers the top most card from your hand to the discarded pile


    }

    static void drawCards(CardStack myDeck)
    {
        Random rand = new Random();
        CardStack hand = new CardStack();
        CardStack discardedPile = new CardStack();

        if (myDeck.peek() != null)
        {
           //making sure the amount of cards drawn isn't 0
           int random = 1;
           random = rand.nextInt(1 + 5);
           if (random == 0)
           {
               random = 1;
           }

           //transfers the top-most card from the deck to the hand
            for (int i =  - 1; i >= 0; i--)
            {
                hand.push(myDeck.pop());
            }
            System.out.print("\nDRAWING ");

            //Player Deck
           System.out.print("MY DECK ");
           myDeck.printStack();

           //Player Hand
           System.out.println("");
           System.out.print("MY HAND ");
           hand.printStack();

           //Discarded hands
           System.out.print("DISCARDED PILE ");
           discardedPile.printStack();
        }
        else if (myDeck.peek() == null)
        {
            System.out.println("DECK EMPTY");
        }
    }

    static void discardCards(CardStack hand)
    {
        Random rand = new Random();
        CardStack discardedPile = new CardStack();

        if (hand.peek() != null)
        {
            System.out.println("DISCARDING CARDS \n");
            while (hand.peek() != null)
            {
                discardedPile.push(hand.pop());
            }
          System.out.println("");
          System.out.print("\nMYDECK ");
          hand.printStack();
          System.out.print("\nDISCARDED ");
          discardedPile.printStack();
        }
        else if (hand.peek() == null)
        {
            System.out.print("HAND EMPTY");
        }
    }

    static void getDiscardedCards(CardStack discardedPile)
    {
        Random rand = new Random();
        CardStack hand = new CardStack();
        if (discardedPile.peek() != null)
        {
            System.out.println("\n DRAWING CARDS FROM THE DISCARDED PILE \n");
            //making sure the amount of cards drawn isn't 0
            int random = 1;
            random = rand.nextInt(1 + 5);
            if (random == 0) {
                random = 1;
            }

            //transfers the top-most card from the deck to the hand
            for (int i = random - 1; i >= 0; i--) {
                //discardedPile.push(hand.pop()); //transfers the top most card from your hand to the discarded pile
                hand.push(discardedPile.pop());
            }
          //Discarded hands
          System.out.print("DISCARDED DECK ");
          discardedPile.printStack();

          //Player Hand
          System.out.println("");
          System.out.print("MY HAND ");
          hand.printStack();
          System.out.println("");
        }
        else if (discardedPile.peek() == null)
        {
            System.out.println("DISCARDED PILE EMPTY");
        }
    }

    static int RNG(int RNG)
    {
        Random rand = new Random();
        RNG = rand.nextInt(1 + 30);
        System.out.println("Random Integers: "+ RNG);
        return RNG;
    }
}
