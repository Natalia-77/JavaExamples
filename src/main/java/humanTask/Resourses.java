package humanTask;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Resourses implements Human,Recruter{
    private  String name;
    private int age;
    private int salary;

    public Resourses(String name,int age, int salary){
        this.name=name;
        this.age= age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Our human : " + getName() + "has "
                + getAge() + " with salary " + getSalary();
    }

    public int addSalary(int salaryNew){
        return salary+=salaryNew;
    }

    @Override
    public void work(String position) {
        System.out.println("Your position is " + position + "with salary" + getSalary());
    }

    @Override
    public void learn(String subject) {
        System.out.println("You must learn " + subject);
    }

    @Override
    public boolean screen(int level) {
        int levelStandart = 10;
        if(level>levelStandart){
            System.out.println("Congrats!You pass the test");
            return  true;
        }
        return false;
    }

    @Override
    public boolean offer(int score) {
        int scoreStandart = 5;
        if(score>scoreStandart){
            System.out.println("You get offer");
            return  true;
        }
        return false;
    }
}
