package com.romanburgos;

public class PlayerLinkedList
{
    //always add head for reference
    private PlayerNode head;

    //function add element to front
    public void addToFront(Players player)
    {
        //if want to add new element
        //need to connect new element to last element
        //create a new player node
        PlayerNode playerNode = new PlayerNode(player);
        //switch to head
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    //print an element inside of linklist
    public void printList()
    {
        //current playernode point to head
        PlayerNode current = head;
        System.out.println("Head -> ");
        //check if current is not null
        while (current != null)
        {
            System.out.print(current);
            System.out.print(" -> ");
            //make the current to the next node of current
            current = current.getNextPlayer();
        }
        System.out.println("Null");
    }

}
