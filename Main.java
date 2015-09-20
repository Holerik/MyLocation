import org.jboss.weld.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Created by Рома on 13.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        org.jboss.weld.environment.se.Weld weld = new org.jboss.weld.environment.se.Weld();
        WeldContainer container = weld.initialize();
        BookService bookService = container.instance().select(BookService.class).get();
        Book book = bookService.createBook("H2G2", 12.5f, "Interesting book in the high technician sphere");
        Book book1 = bookService.createBook("The Brother Wolf", 2.0f, "Interesting book about friendship");
        System.out.println(book);
        weld.shutdown();
    }
}
