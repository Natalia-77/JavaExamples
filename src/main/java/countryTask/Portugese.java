package countryTask;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Portugese extends Country {

    private boolean hasOcean;
    private int population;

    public Portugese(int size, String name) {
        super(size, name);
        this.hasOcean = true;
        this.population=2000;
    }

    public boolean isBigger(Country other){
        if(this.getSize()> other.getSize()){
            System.out.println("Portuguese is bigger");
            return true;
        }
        else{
            System.out.println("Other country is bigger");
            return false;
        }
    }

    public int addPopulation(int number){
        this.population+=number;
        return this.population;
    }

    public int removePopulation(int number){
        this.population-=number;
        return this.population;
    }

    @Override
    public String toString() {
        return "Portuguese has capital " + getName() +
                " and has ocean";
    }
}
