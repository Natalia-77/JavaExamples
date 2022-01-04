package countryTask;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Country {
    private int size;
    private String name;


    public Country(int size,String name){
        this.size=size;
        this.name=name;
    }
}
