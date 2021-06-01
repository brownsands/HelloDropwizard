package com.javaeeee.bean;

public class Player {
    String name;
    int guess;

    public Player(String name, int guess) {
        this.name = name;
        this.guess = guess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }
}
