public class MainRational {

    public static void main(String[] args) {
        Rational number =  new Rational();
        number.numerator = 1652;
        number.denominator = 452;
        number.printRational();
        System.out.println(number.reduce());
        System.out.println(number.toDouble());
        number.negate();
        number.printRational();
        number.invert();
        number.printRational();
    }

}
