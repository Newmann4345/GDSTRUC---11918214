package com.macabuagjoaquin;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

//      //Declaring an Array
//      List<Player> playerList = new ArrayList<>();
//      //Declaring the elements
//      playerList.add(new Player(1, "Asuna", 100));
//      playerList.add(new Player(2, "LethalBacon", 205));
//      playerList.add(new Player(3, "HPDeskJet", 34));

        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskjet = new Player (3, "HPDeskJet", 34);

        //Declaring a linkedlist
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();
        //Filling the LinkedList
        playerLinkedList.addtoFront(asuna);
        playerLinkedList.addtoFront(lethalBacon);
        playerLinkedList.addtoFront(hpDeskjet);

        //Print before the purge
        playerLinkedList.printList();
        //THE PURGE
        playerLinkedList.removeHead();
        //Print after the purge
        playerLinkedList.printList();

//       //getting an element
//       System.out.println(playerList.get(0));

//       //adding an element
//     playerList.add(2, new Player(553, "Arctis", 55));

//       //removing an element
//      playerList.remove(2);

        //the Contains function "Returns true if it returns the specified element".
            //Good for stat checks? I dunno
//       System.out.println(playerList.contains(new Player(2, "LethalBacon", 205)));

        //IndexOf function "Returns the index of the first occurence of the specified element in this list".
            //it's different? somehow
//        System.out.println((playerList.indexOf(new Player(2, "LethalBacon", 205))));

       //2 ways to print the Array's elements
//       playerList.forEach(player -> System.out.println(player));
//   for (Player p : playerList)
//   {
//       System.out.println(p);
//    }
    }
}
