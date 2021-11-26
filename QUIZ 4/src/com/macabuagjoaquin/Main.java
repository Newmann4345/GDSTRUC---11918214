package com.macabuagjoaquin;

public class Main {

    public static void main(String[] args) {

        Player ploo = new Player(134, "Plooful", 135);
        Player wardell = new Player(536, "TSM Wardell", 648);
        Player deadlyJimmy = new Player(32, "DeadlyJimmy", 34);
        Player subroza = new Player(4931, "Subroza", 684);
        Player annieDro = new Player(6919, "C9 Annie", 593);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put(ploo.getUsername(), ploo);
        hashTable.put(wardell.getUsername(), wardell);
        hashTable.put(deadlyJimmy.getUsername(), deadlyJimmy);
        hashTable.put(subroza.getUsername(), subroza);
        hashTable.put(annieDro.getUsername(), annieDro);

        //printing the table
        //hashTable.printHashtable();

        //retrieve an element
        //System.out.println(hashTable.get("Subroza"));

        //removing an element
        hashTable.remove("Plooful");

        //print it again
        hashTable.printHashtable();
    }
}
