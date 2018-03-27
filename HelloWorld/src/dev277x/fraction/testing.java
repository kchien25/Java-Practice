public class testing {
    public static void main(String[] args) {
        Fraction testing = new Fraction();
        Fraction testing2 = new Fraction();
        Fraction testing3 = new Fraction();
        Fraction testing4 = new Fraction();
        Fraction testing5 = new Fraction();

        testing.setFraction(4, 5);
        testing2.setFraction();
        testing3.setFraction(3);
        testing4.setFraction(4, 5);
        testing5.setFraction(8, 10);

        System.out.println(testing.equals(testing5));
        // System.out.println(testing.equals(testing4));
        // System.out.println(testing.equals(testing));
        // System.out.println(testing.equals("4/5"));
        // System.out.println(testing.divide(testing2));
    }
}