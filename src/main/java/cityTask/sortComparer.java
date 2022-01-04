package cityTask;

import java.util.Comparator;

public class sortComparer implements Comparator<Area> {

    @Override
    public int compare(Area o1, Area o2) {
        if ( o1.getBudget() < o2.getBudget() ) return -1;
        else if ( o1.getBudget() == o2.getBudget() ) return 0;
        else return 1;
    }
}
