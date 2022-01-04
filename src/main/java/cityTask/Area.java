package cityTask;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Area extends City {
    private int size;
    private int budget;
    private NameArea nameArea;
    private MajorName majorName;

    public Area(int size,int budget,NameArea nameArea,MajorName majorName){
        this.size=size;
        this.budget = budget;
        this.nameArea=nameArea;
        this.majorName=majorName;
    }

    //add money for budget
    public int addMoney(int sum){
        this.budget+=sum;
        return this.budget;
    }

}
