package bookTask;

import lombok.Data;
import java.util.ArrayList;
import java.util.Scanner;

@Data
public class BookStore implements  DetectiveBook ,DramaBook {
    String name;
    private int totalPrice;
    ArrayList<BookDetective> book= new ArrayList<BookDetective>();
    ArrayList<BookDrama> bookDrama= new ArrayList<BookDrama>();

    public BookStore(String name){

        this.name=name;
        this.totalPrice = 5000;
    }

    @Override
    public void addDetective(String title, String author, int year, int price) {
      book.add(new BookDetective(title,author,"Detective",year,price));
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
        book.add(new BookDetective(titleNew, authorNew, genreNew, yearNew, priceNew));
        this.totalPrice+=priceNew;

    }
    @Override
    public void soldDetective(String titleName ) {
        for (int i = 0; i < book.size(); i++) {
           if(book.get(i).getAuthor().toString()==titleName){
               book.remove(book.get(i));
           }
        }

    }
    public void addBooks(){
        book.add(new BookDetective("First","Petrov","Detective",2020,358));
        book.add(new BookDetective("Second","Ivanov","Detective",1998,600));
        book.add(new BookDetective("Third","Romanov","Detective",2013,125));
    }

    public void Print(){
        for (BookDetective i:book)
        {
            System.out.println(i.getAuthor());
        }
    }

    @Override
    public void addDrama(String title, String author, int year, int price) {
        bookDrama.add(new BookDrama(title,author,"Drama",year,price));
    }

    @Override
    public void soldDrama(String title) {
        for (int i = 0; i < bookDrama.size(); i++) {
            if(bookDrama.get(i).getAuthor().toString()==title){
                bookDrama.remove(bookDrama.get(i));
            }
        }
    }
}
