import javax.inject.Inject;import java.lang.Float;import java.lang.String;

/**
 * Created by Рома on 11.09.2015.
 */
public class BookService {
    @Inject @ThirteenDigits
    private NumberGenerator numberGenerator;
    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setNumber(numberGenerator.generateNumber());
        return book;
    }
}
