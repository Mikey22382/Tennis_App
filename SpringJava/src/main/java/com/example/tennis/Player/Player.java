package com.example.tennis.Player;

import java.util.*;

public class Player {
    private int id;
    private ArrayList<Player> previousMatches;
    private String name;
    private double rank;

    public Player(int id, String name, double rank) {
        this.id = id;
        this.previousMatches = new ArrayList<>();
        this.name = name;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Player> getPreviousMatches() {
        return previousMatches;
    }

    public void addPreviousMatches(Player p) {
        this.previousMatches.add(p);
    }

    public boolean hasPlayed(Player p) {
        return this.previousMatches.contains(p);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }
}
