public class Main {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println(myMaxFloatValue);
        System.out.println(myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println(myMaxDoubleValue);
        System.out.println(myMinDoubleValue);

        int myIntValue = 5 / 3;
        float myFloat = 5f / 3f;
        double myDouble = 5d / 3d;

        System.out.println(myIntValue);
        System.out.println(myFloat);
        System.out.println(myDouble);

        double pounds = 10d;
        double kg = pounds * .45397237d;
        System.out.println(kg);
    }
}
