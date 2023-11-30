package com.example.tennis.Player;

import java.util.*;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Player {
    @Id
    @SequenceGenerator(
        name = "player_sequence",
        sequenceName = "player_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "player_sequence"
    )
    private Long id;

    @ManyToMany
    private ArrayList<Player> previousMatches;

    private String name;
    private double rank;

    // database generated id
    public Player( String name, double rank) {
        this.previousMatches = new ArrayList<>();
        this.name = name;
        this.rank = rank;
    }

    // input id
    public Player(Long id, String name, double rank) {
        this.id = id;
        this.previousMatches = new ArrayList<>();
        this.name = name;
        this.rank = rank;
    }

    public Long getId() {
        return id;
    }

    // do we want ids to be mutable?
    public void setId(Long id) {
        this.id = id;
    }

    // public ArrayList<Player> getPreviousMatches() {
    //     return previousMatches;
    // }

    // public void addPreviousMatches(Player p) {
    //     this.previousMatches.add(p);
    // }

    // public boolean hasPlayed(Player p) {
    //     return this.previousMatches.contains(p);
    // }

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
