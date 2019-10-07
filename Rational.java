public class Rational {
    int numerator;
    int denominator;

    Rational() {
    this.numerator = 0;
    this.denominator = 1;
    }

    Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void invert(){
        int temp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = temp;
    }

    public void negate(){
        this.numerator = -this.numerator;
    }

    public int reduce(){
        int first = this.numerator;
        int second = this.denominator;
        int temp = 0;
        while (second != 0) {
            temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }

    public double toDouble(){
        double result = this.numerator/this.denominator;
        return result;
    }

    public void printRational(){
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public String toString(){
        return String.format("%d/%d", this.numerator, this.denominator);
    }
}
