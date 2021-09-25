package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println(highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println(highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("one", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("two", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("three", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("four", position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " got into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        }
        if (score >= 500) {
            return 2;
        }
        if (score >= 100) {
            return 3;
        }
        return 4;
    }
}
