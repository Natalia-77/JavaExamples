package program;

import bookTask.BookStore;
import carTask.Car;
import carTask.CarModel;
import cityTask.*;
import countryTask.Portugese;
import countryTask.Ukraine;
import fractionTask.Fraction;
import humanTask.Resourses;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 4.Fraction
//        Fraction fraction = new Fraction(1,5);
//        Fraction fracOther=fraction.sum(3);
//        System.out.println(fracOther.ToString());
//        Fraction fraction1=new Fraction(2,3);
//        fracOther=fraction.multiply(fraction1);
//        System.out.println(fracOther.ToString());
//        //Task 3.Country
//        Portugese post = new Portugese(3254,"Lisbon");
//        System.out.println(post.toString());
//        post.addPopulation(1000);
//        post.addPopulation(2000);
//        System.out.println( post.getPopulation());
//        Ukraine ukraine =new Ukraine(2122,"Kyiv");
//        System.out.println(ukraine.toString());
//        post.isBigger(ukraine);
//        ukraine.addFemale(2);
//        System.out.println(ukraine.toString());
//        //Task 2.City
//        City city = new City();
//        city.setName("Rivne");
//        city.addArea();
//        System.out.println("Before sort:");
//        city.Print();
//        Arrays.sort(city.getAreaList(),new sortComparer());
//        System.out.println("After sort:");
//        city.Print();
//        //Task 1.Human
//        Resourses resourses = new Resourses("Roman Romanov", 22 ,15000);
//        resourses.addSalary(2000);
//        System.out.println(resourses.toString());
//        resourses.offer(230);
//        resourses.screen(233);
//        BookStore store=new BookStore("Slovo");
//        store.addBooks();
//        store.Print();
//        store.addDetective();
//        store.Print();
//        store.soldDetective("Petrov");
//        store.Print();

        Car car = new Car("A100", CarModel.Audi, 1998,"Ivanov");
        car.move();
        car.addSpeed(20);
        car.addSpeed(30);
        System.out.println(car.toString());
        car.stop();




    }
}
