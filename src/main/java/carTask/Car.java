package carTask;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Car implements  CarActions {
    String make;
    CarModel carModel;
    int year;
    int speed;
    final int maxSpeed;
    String owner;

    public Car(String make, CarModel carModel, int year, String owner)
    {
        this.make =make;
        this.carModel = carModel;
        this.year = year;
        this.owner = owner;
        maxSpeed = 200;
    }

    @Override
    public void move() {
        System.out.println("Start moving...");
        this.speed+=20;
    }

    @Override
    public void addSpeed(int speed) {
        if(this.speed>maxSpeed){
            System.out.println("Max speed is used.You cant get more.");
        }
        else{
            this.speed+=speed;
        }
    }

    @Override
    public void stop() {
        System.out.println("You stopping...");
        this.speed=0;
    }

    @Override
    public String toString() {
        return "Car model" +  make + '\'' +
                ", carModel=" + carModel +
                ", year=" + year +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", owner='" + owner;
    }

    public void addCar(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter make:");
        String makeNew = in.nextLine();
        System.out.println("Enter owner:");
        String ownerNew =in.nextLine();
        CarModel carModelNew = CarModel.Mazda;
        System.out.println("Enter year:");
        int yearNew = in.nextInt();
        new Car(makeNew, carModelNew, yearNew, ownerNew);

    }
}
