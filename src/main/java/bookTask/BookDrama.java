package bookTask;

import lombok.Data;

@Data
public class BookDrama {
    private String title;
    private String author;
    private String genre;
    private int year;
    private int price;

    public BookDrama(String title, String author, String genre, int year, int price){
        this.title = title;
        this.author = author;
        this.genre = "Drama";
        this.year = year;
        this.price = price;
    }
}
