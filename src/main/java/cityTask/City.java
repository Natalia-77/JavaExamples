package cityTask;

import lombok.Data;

@Data
public class City {
    private String name;
    private Area [] areaList;


    public void addArea(){
        areaList =new Area []{
                new Area(222,11500,NameArea.Center,MajorName.Pertov),
                new Area(125,2000,NameArea.Yubik,MajorName.Pupkin),
                new Area(458,3522,NameArea.Pivnichniy,MajorName.Sidorov),
                new Area(788,9562,NameArea.Lionokombinat,MajorName.Ivanov)
        };
    }

    public void Print(){
        for (Area i : areaList) {
            System.out.println(i.getBudget());
        }
    }
}
