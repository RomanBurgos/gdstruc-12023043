package com.romanburgos;

public class PlayerLinkList {
    //first element is always the head
    //reference to head
    private PlayerNode head;

    //add element infront of linklist
    public void addToFront(Player player)
    {
        //if want element infront always need to connect new element to first element
        PlayerNode playerNode = new PlayerNode(player);
        //set this to head
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    //create function to print elements inside of linklist
    //to print element must know when to stop
    public void printList()
    {
        //current player noid and point it to head
        PlayerNode current = head;
        System.out.println("Head -> ");
        //check if the current is not null
        while (current != null)
        {
            System.out.print(current.getPlayer().getName() + ", Level: " + current.getPlayer().getLevel() + ", ID: " + current.getPlayer().getId());
            System.out.print(" -> ");
            //make the current to the next current node
            current = current.getNextPlayer();
        }
        //at the end
        System.out.println("null");
    }
}
