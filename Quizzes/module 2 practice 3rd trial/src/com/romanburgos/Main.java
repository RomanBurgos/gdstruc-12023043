package com.romanburgos;

public class Main {

    public static void main(String[] args) {

        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskjet = new Player(3, "HPDeskjet", 34);

        //create player link list
        PlayerLinkList playerLinkList = new PlayerLinkList();

        //add objects
        //assign front head
        playerLinkList.addToFront(asuna);
        playerLinkList.addToFront(lethalBacon);
        playerLinkList.addToFront(hpDeskjet);

        //print all elements
        playerLinkList.printList();

    }
}
