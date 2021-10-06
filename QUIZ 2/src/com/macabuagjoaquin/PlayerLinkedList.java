package com.macabuagjoaquin;

public class PlayerLinkedList {
   private PlayerNode head;

// public void removefront(Player player)
// {
//     PlayerNode playerNode = playerNode.getNextPlayer(head);
//     playerNode.getNextPlayer();
//     head = playerNode;
// }

    public Player removeHead()
    {
        Player remove = head.getPlayer();
        head = head.getNextPlayer();
        return remove;
    }

   public void addtoFront(Player player)
   {
       PlayerNode playerNode = new PlayerNode(player);
       playerNode.setNextPlayer(head);
       head = playerNode;
   }

    public void printList()
    {
        PlayerNode current = head;
        System.out.println("HEAD -> ");
        while (current != null) {
            System.out.println(current.getPlayer() + "->");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }
}
