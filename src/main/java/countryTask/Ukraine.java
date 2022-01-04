package countryTask;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ukraine extends Country{
    private boolean hasOcean;
    private int population;
    private double female;
    private double male;

    public Ukraine(int size, String name) {
        super(size, name);
        this.hasOcean = false;
        this.population=5000;
        this.female=58;
        this.male=42;
    }

    public int addPopulation(int number){
        this.population+=number;
        return this.population;
    }

    public double addFemale(double peers){
        this.female+=peers;
        this.male-=peers;
        return (this.female);
    }


    @Override
    public String toString() {
        return "Ukraine has capital " + getName() +
                " and has not ocean.Female- "+ getFemale() + "%" + " Male- " + getMale() + "%";
    }

}
