package starter.search;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WikipediaArticle {
    public static final Target HEADING =  Target.the("article identifier").located(By.id("firstHeading"));
}
