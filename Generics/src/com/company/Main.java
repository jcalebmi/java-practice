package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code
        ArrayList<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);


        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team adelaidCrows = new Team("AdelaidCrows");

        adelaidCrows.addPlayer(joe);
        adelaidCrows.addPlayer(pat);
        adelaidCrows.addPlayer(beckham);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (Integer i : n) {
            System.out.println(i*2);
        }
    }
}
