import java.lang.Float;import java.lang.Override;import java.lang.String; /**
 * Created by Рома on 11.09.2015.
 */
public class Book {
    private String title;
    private Float price;
    private String description;
    private String number;

    public Book(String title, Float price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }
    
    public void setNumber(String generatedNumber){
        this.number = generatedNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
