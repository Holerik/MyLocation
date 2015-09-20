import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by ���� on 13.09.2015.
 */
@EightDigits
public class IssnGenerator implements NumberGenerator {
    @Inject
    private Logger logger;
    @Loggable
    public String generateNumber(){
        String issn = "8-" + Math.abs(new Random().nextInt());
        logger.info("������������ ISSN : " + issn);
        return issn;
    }
}
