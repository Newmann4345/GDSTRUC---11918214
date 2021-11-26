package com.macabuagjoaquin;

import java.util.Objects;

public class Player {
    private int id;
    private String Username;
    private int level;

    public int getId() {
        return id;
    }

    //This is for checking the values instead of instance
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && level == player.level && Objects.equals(Username, player.Username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Username, level);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public Player(int id, String name, int level) {
        this.id = id;
        this.Username = name;
        this.level = level;
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
                ", name='" + Username + '\'' +
                ", level=" + level +
                '}';
    }
}
