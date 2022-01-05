package bookTask;

import lombok.Data;

@Data
public class BookDetective {

    private String title;
    private String author;
    private String genre;
    private int year;
    private int price;

    public BookDetective(String title, String author, String genre, int year, int price){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }
}
