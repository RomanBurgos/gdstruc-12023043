package com.romanburgos;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public PlayerNode removeHead() {
        PlayerNode removed = head;
        head = head.getNextPlayer();
        return removed;
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.println("Head -> ");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }
}
