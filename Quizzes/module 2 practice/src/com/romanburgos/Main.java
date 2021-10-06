package com.romanburgos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        //player add Elements
        // default fuction "add" always adds at the end of the array
        playerList.add(new Player(1, "Asuna", 100));
        playerList.add(new Player(2, "Emiya", 200));
        playerList.add(new Player(3, "Akyros", 70));


        //access a single element in array list
        //use get function
        //retrieve element
        //System.out.println(playerList.get(1));

        //what if insert an element in the middle of an elements
        playerList.add(2, new Player(753, "Johan", 84));

        //what if you want to remove element
        playerList.remove(2);

        //contains
        //reason why false is because its a new player
        //System.out.println(playerList.contains(new Player(2, "Emiya", 200)));

        //advance method
        //playerList.forEach(player -> System.out.println(player));

        //print players
        //for (Player p : playerList)
        //{
        //    System.out.println(p);
        //}

    }
}
