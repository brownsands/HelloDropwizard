package com.javaeeee.client;

import com.javaeeee.bean.Game;

import com.javaeeee.service.GameInterface;
import com.javaeeee.service.GameOperation;
import com.javaeeee.service.PlayerOperation;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Scanner;

public class GameApplication
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Guess 2/3 avg Game");
        System.out.println("Enter Start Time of Game - HH:MM");
        System.out.println("Enter End Time of Game - HH:MM");
        String s, e;
        s = sc.nextLine();
        e = sc.nextLine();
        LocalTime s1 = LocalTime.parse(s);
        LocalTime e1 = LocalTime.parse(e);
       Game g = new Game(s1, e1);

       menu();

        int choice = sc.nextInt();
        sc.nextLine();
        while(choice!=2) {


           if(choice==1) {

               LocalTime time=LocalTime.now();
                int v=time.compareTo(g.getEnd());

                if(v>0)
                {
                    GameOperation go=new GameOperation();
                    if(g.getA().size()!=0)
                    go.CalculateResult(g);
                    System.out.println("Winner of Game is:" + g.getWinner());

                }
                else
                {
                    System.out.println("Enter name");
                    String n=sc.nextLine();
                    System.out.println("Enter value btw 0-100");
                    int num= sc.nextInt();
                    sc.nextLine();
                    PlayerOperation p = new PlayerOperation();
                    p.addPlayer(n,num,g);
                }
            }
            menu();
            choice = sc.nextInt();
            sc.nextLine();
            if(choice==2)
            {   GameOperation go=new GameOperation();
                if(g.getA().size()!=0)
                    go.CalculateResult(g);
                System.out.println("Winner of Game is:" + g.getWinner());
                break;
            }
        }

    }

    public static void menu() {
        System.out.println("Enter Choice");
        System.out.println("1. Guess Avg");
        System.out.println("2. End Game");
    }
}
