package com.macabuagjoaquin;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    ArrayQueue queue = new ArrayQueue(10);
        ArrayQueue match = new ArrayQueue(1);
        Scanner pause = new Scanner(System.in);

        Random rand = new Random();
        int rng = 1;
        int queuecheck = 0;


        queue.add(new Player(1, "aceu", 100));
        queue.add(new Player(2, "Sinatraa", 100));
        queue.add(new Player(3, "Subroza", 95));
        queue.add(new Player(4, "ploo", 90));
        queue.add(new Player(5, "TRYHARD", 67));
        queue.add(new Player(6, "NJwmAhN", 80));
        queue.add(new Player(7, "Shaltir", 99));
        queue.add(new Player(8, "Velavim", 95));
        queue.add(new Player(9, "StealthGamerbr", 75));
        queue.add(new Player(10, "Kurali", 89));
        queue.add(new Player(11, "aceu", 100));
        queue.add(new Player(12, "Sinatraa", 100));
        queue.add(new Player(13, "Subroza", 95));
        queue.add(new Player(14, "ploo", 90));
        queue.add(new Player(15, "TRYHARD", 67));
        queue.add(new Player(16, "NJwmAhN", 80));
        queue.add(new Player(17, "Shaltir", 99));
        queue.add(new Player(18, "Velavim", 95));
        queue.add(new Player(19, "StealthGamerbr", 75));
        queue.add(new Player(20, "Kurali", 89));
        queue.add(new Player(21, "aceu", 100));
        queue.add(new Player(22, "Sinatraa", 100));
        queue.add(new Player(23, "Subroza", 95));
        queue.add(new Player(24, "ploo", 90));
        queue.add(new Player(25, "TRYHARD", 67));
        queue.add(new Player(26, "NJwmAhN", 80));
        queue.add(new Player(27, "Shaltir", 99));
        queue.add(new Player(28, "Velavim", 95));
        queue.add(new Player(29, "StealthGamerbr", 75));
        queue.add(new Player(30, "Kurali", 89));
        queue.add(new Player(31, "aceu", 100));
        queue.add(new Player(32, "Sinatraa", 100));
        queue.add(new Player(33, "Subroza", 95));
        queue.add(new Player(34, "ploo", 90));
        queue.add(new Player(35, "TRYHARD", 67));
        queue.add(new Player(36, "NJwmAhN", 80));
        queue.add(new Player(37, "Shaltir", 99));
        queue.add(new Player(38, "Velavim", 95));
        queue.add(new Player(39, "StealthGamerbr", 75));
        queue.add(new Player(40, "Kurali", 89));
        queue.add(new Player(41, "aceu", 100));
        queue.add(new Player(42, "Sinatraa", 100));
        queue.add(new Player(43, "Subroza", 95));
        queue.add(new Player(44, "ploo", 90));
        queue.add(new Player(45, "TRYHARD", 67));
        queue.add(new Player(46, "NJwmAhN", 80));
        queue.add(new Player(47, "Shaltir", 99));
        queue.add(new Player(48, "Velavim", 95));
        queue.add(new Player(49, "StealthGamerbr", 75));
        queue.add(new Player(50, "Kurali", 89));
        queue.add(new Player(51, "aceu", 100));
        queue.add(new Player(52, "Sinatraa", 100));
        queue.add(new Player(53, "Subroza", 95));
        queue.add(new Player(54, "ploo", 90));
        queue.add(new Player(55, "TRYHARD", 67));
        queue.add(new Player(56, "NJwmAhN", 80));
        queue.add(new Player(57, "Shaltir", 99));
        queue.add(new Player(58, "Velavim", 95));
        queue.add(new Player(59, "StealthGamerbr", 75));
        queue.add(new Player(60, "Kurali", 89));
        queue.add(new Player(61, "aceu", 100));
        queue.add(new Player(62, "Sinatraa", 100));
        queue.add(new Player(63, "Subroza", 95));
        queue.add(new Player(64, "ploo", 90));
        queue.add(new Player(65, "TRYHARD", 67));
        queue.add(new Player(66, "NJwmAhN", 80));
        queue.add(new Player(67, "Shaltir", 99));
        queue.add(new Player(68, "Velavim", 95));
        queue.add(new Player(69, "StealthGamerbr", 75));
        queue.add(new Player(70, "Kurali", 89));
        queue.add(new Player(71, "aceu", 100));
        queue.add(new Player(72, "Sinatraa", 100));
        queue.add(new Player(73, "Subroza", 95));
        queue.add(new Player(74, "ploo", 90));
        queue.add(new Player(75, "TRYHARD", 67));
        queue.add(new Player(76, "NJwmAhN", 80));
        queue.add(new Player(77, "Shaltir", 99));
        queue.add(new Player(78, "Velavim", 95));
        queue.add(new Player(79, "StealthGamerbr", 75));
        queue.add(new Player(80, "Kurali", 89));
        queue.add(new Player(81, "aceu", 100));
        queue.add(new Player(82, "Sinatraa", 100));
        queue.add(new Player(83, "Subroza", 95));
        queue.add(new Player(84, "ploo", 90));
        queue.add(new Player(85, "TRYHARD", 67));
        queue.add(new Player(86, "NJwmAhN", 80));
        queue.add(new Player(87, "Shaltir", 99));
        queue.add(new Player(88, "Velavim", 95));
        queue.add(new Player(89, "StealthGamerbr", 75));
        queue.add(new Player(80, "Kurali", 89));



        //queue.printQueue();
        //queue.remove();
        //queue.add(new Player(5, "tenZ", 95));

        //myDeck.push(card1); //Adds a card to the deck
        //hand.push(myDeck.pop()); //transfers the top-most card from the deck to the hand

        //queue.add(card1); //Adds a card to the deck
        //match.add(queue.remove()); //transfers the top-most card from the deck to the hand

        while (queuecheck <= 10)
        {
            //selects random players
            rng = rand.nextInt(7 + 1);
            //System.out.println("\n" + rng);

            //Clearing the queue
            while (match.size() >= 1)
            {
                match.remove();
            }

            //adding to match queue
            for (int a = rng - 1; a >= 0; a--)
            {
                match.add(queue.remove());
            }

            System.out.println("\nIN QUEUE: \t" + match.size() + "\tMATCHES: \t" + queuecheck);
            match.printQueue();

            if (rng < 5)
                {
                    System.out.println("\n Not enough players in match queue");
                    for (int a = rng - 1; a >= 0; a--)
                    {
                        queue.add(match.remove());
                    }
                }
            else if (rng >= 5)
            {
                System.out.println("\nMATCH START!");
                queuecheck++;
            }

            //printing player queue
            System.out.println("\nAfter popping: \n");
            queue.printQueue();
            pause.nextLine();
        }
    }
}
