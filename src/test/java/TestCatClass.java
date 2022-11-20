import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TestCatClass {

    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void checkGetSoundCat() {
        String expected = "Мяу";
        assertEquals("Кошка не умеет делать Мяу", expected, cat.getSound());
    }

    @Test
    public void checkCatEatMeat() throws Exception {
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals("Кошки не едят мясо!", expected, cat.getFood());
    }
}
