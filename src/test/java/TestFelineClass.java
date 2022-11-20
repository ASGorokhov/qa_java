import com.example.Feline;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TestFelineClass {

    Feline feline = new Feline();

    @Test
    public void checkFelineEatMeat() throws Exception {
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals("Кошачьи не едят мясо!", expected, feline.eatMeat());
    }

    @Test
    public void checkToFelineFamily() {
        String expected = "Кошачьи";
        assertEquals("Принадлежность к семейству Кошачьи не определена!", expected, feline.getFamily());
    }

    @Test
    public void checkFelineKittensCountFixedParameter() {
        int expected = 1;
        assertEquals("Количество котят не равно фиксированному значению!", expected, feline.getKittens());
    }

    @Test
    public void checkFelineKittensCountWithThePassedParameter() {
        int expected = 5;
        assertEquals("Количество котят не соответствует заданным параметрам!", expected, feline.getKittens(expected));
    }
}
