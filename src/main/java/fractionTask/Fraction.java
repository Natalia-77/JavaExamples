package fractionTask;
import lombok.*;

@Data

public class Fraction {
    @NonNull
    public int numerator;
    @NonNull
    public int denominator;


    public String ToString(){
        return String.format("Fraction result  %s / %s",numerator,denominator);
    }

    public Fraction sum(Fraction other){
        //returns result of sum two fractions
        Fraction result = new Fraction(1,1);
        //denominators are equals
        if(this.denominator == other.denominator){
            result.denominator = this.denominator;
            result.numerator = this.numerator + other.numerator;
        }
        return result;
    }

    public Fraction sum(int number){
        //returns sum of fraction and number
        Fraction result = new Fraction(1,1);
            result.denominator = this.denominator;
            result.numerator = this.numerator + number;

        return result;
    }

    public Fraction multiply(Fraction other) {
        //returns result of multiply two fractions
        Fraction result = new Fraction(1,1);
        result.denominator = this.denominator * other.denominator;
        result.numerator = this.numerator * other.numerator;
        return result;
    }
}
