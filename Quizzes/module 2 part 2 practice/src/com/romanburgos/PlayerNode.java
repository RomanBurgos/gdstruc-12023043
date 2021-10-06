package com.romanburgos;

public class PlayerNode {
    //all you need for player node
    private Players player;
    private PlayerNode nextPlayer;

    public PlayerNode(Players player) {
        this.player = player;
    }

    public Players getPlayer() {
        return player;
    }

    public void setPlayer(Players player) {
        this.player = player;
    }

    public PlayerNode getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(PlayerNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }
}
