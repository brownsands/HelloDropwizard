package com.javaeeee.bean;


import java.time.LocalTime;
import java.util.ArrayList;

public class Game
{
    private boolean started;
    private boolean ended;
    private ArrayList<Player> a;
    private String winner;
    private LocalTime start,end;

    public Game(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
        this.a=new ArrayList<Player>();
        this.started=true;
        this.ended=false;
        this.winner="No one guessed.";
    }

    public ArrayList<Player> getA() {
        return a;
    }

    public void setA(ArrayList<Player> a) {
        this.a = a;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }





    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public boolean isEnded() {
        return ended;
    }

    public void setEnded(boolean ended) {
        this.ended = ended;
    }
}
