package bookTask;

import cityTask.Area;
import lombok.Data;

import java.util.Scanner;

@Data
public class BookStore implements  DetectiveBook,DramaBook {

    private String title;
    private String author;
    private String genre;
    private int year;
    private int price;
    private int totalPrice;

    public BookStore(String title, String author, String genre, int year, int price){
       this.title = title;
       this.author = author;
       this.genre = genre;
       this.year = year;
       this.price = price;
   }
    @Override
    public void addDetective(String title, String author, int year, int price) {

       new BookStore(title,author,"Detective",year,price);
       this.totalPrice+=price;
    }

    public void addDetective(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter title:");
        String titleNew = in.nextLine();
        System.out.println("Enter author:");
        String authorNew =in.nextLine();
        String genreNew = "Detective";
        System.out.println("Enter year:");
        int yearNew = in.nextInt();
        System.out.println("Enter price:");
        int priceNew = in.nextInt();
        this.totalPrice+=priceNew;
        new BookStore(titleNew,authorNew,genreNew,yearNew,priceNew);
    }

    @Override
    public void soldDetective(int price) {
       this.totalPrice-=price;
    }

    public void soldDetective() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter price sold:");
        int priceNew = in.nextInt();
        this.totalPrice-=priceNew;
    }

    @Override
    public void addDrama(String title, String author, int year, int price) {
        new BookStore(title,author,"Drama",year,price);
        this.totalPrice+=price;
    }

    @Override
    public void soldDrama(String title) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter price sold:");
        int priceNew = in.nextInt();
        this.totalPrice-=priceNew;
        System.out.println("Already sold "+ title);
    }
}
