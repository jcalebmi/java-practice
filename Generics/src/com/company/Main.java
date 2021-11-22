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

        Team<FootballPlayer> adelaidCrows = new Team<>("AdelaidCrows");

        adelaidCrows.addPlayer(joe);
//        adelaidCrows.addPlayer(pat);
//        adelaidCrows.addPlayer(beckham);
        System.out.println(adelaidCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("Soccer team");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Freemantle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaidCrows, 3, 8);

        adelaidCrows.matchResult(fremantle, 2, 1);
//        adelaidCrows.matchResult(baseballTeam, 1, 1);
        System.out.println("Ranks");
        System.out.println(adelaidCrows.getName() + adelaidCrows.ranking());
        System.out.println(melbourne.getName() + melbourne.ranking());
        System.out.println(fremantle.getName() + fremantle.ranking());
        System.out.println(hawthorn.getName() + hawthorn.ranking());

        System.out.println(adelaidCrows.compareTo(melbourne));
        System.out.println((adelaidCrows.compareTo(hawthorn)));
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (Integer i : n) {
            System.out.println(i*2);
        }
    }
}
