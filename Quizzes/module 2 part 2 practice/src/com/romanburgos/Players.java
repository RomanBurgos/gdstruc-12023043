package com.romanburgos;

import java.util.Objects;

public class Players {
    private int id;
    private String name;
    private int level;

    public Players(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Players players = (Players) o;
        return id == players.id && level == players.level && Objects.equals(name, players.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level);
    }
}
