package com.romanburgos;

import java.util.Objects;

public class Player {
    //fields for players
    private int id;
    private String name;
    private int level;

    //Constructor = generate > constructor > select all fields > ok
    public Player(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    //generate > getter and setter > select all > ok Public gets and setter for fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

    //overide equals function
    //it checks for the values instead of an instance
    //true

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && level == player.level && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level);
    }
}
