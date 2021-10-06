package com.romanburgos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player saber = new Player(1, "Saber", 100);
        Player archer = new Player(2, "Archer", 80);
        Player lancer = new Player(3, "Lancer", 50);


        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        //add to front head
        playerLinkedList.addToFront(saber);
        playerLinkedList.addToFront(archer);
        playerLinkedList.addToFront(lancer);

        //remove head
        playerLinkedList.removeHead();
        //print list
        playerLinkedList.printList();

    }
}
