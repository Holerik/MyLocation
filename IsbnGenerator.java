import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by Рома on 13.09.2015.
 */
@ThirteenDigits
public class IsbnGenerator implements NumberGenerator {
    @Inject
    private Logger logger;
    @Loggable
    public String generateNumber(){
        String isbn = "13-84356-" + Math.abs(new Random().nextInt());
        logger.info("Generated ISBN : " + isbn);
        return isbn;
    }
}
