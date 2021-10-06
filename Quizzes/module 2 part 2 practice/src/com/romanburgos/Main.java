package com.romanburgos;

public class Main {

    public static void main(String[] args) {

        Players asuna = new Players(1, "Asuna", 100);
        Players lethalBacon = new Players(2, "lethalBacon", 205);
        Players hpDeskjet = new Players(3, "hpDeskjet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        playerLinkedList.printList();

    }
}
