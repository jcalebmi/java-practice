public class overload {
    public static void main(String[] args) {
        int newScore = calculateScore("tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calculateFeet(157);
        System.out.println(centimeters);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points");
        return score + 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed score " + score + " points");
        return score + 1000;
    }
    public static int calculateScore() {
        System.out.println("none");
        return 0;
    }

    public static double calculateFeet(double feet, double inches) {
        if (feet < 0) {
            return - 1;
        }
        if (inches < 0 || inches > 12) {
            return -1;
        }
        return ((feet * 12) + inches) * 2.54;
    }
    public static double calculateFeet(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double reaminingInches = (int) inches % 12;
        return calculateFeet(feet, reaminingInches);
    }
}
