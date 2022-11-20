import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLionClass {

    @Before
    public void init() {
       MockitoAnnotations.initMocks(this);
   }
    String sex;
    boolean hasMane;

    @Mock
    Feline feline;

    public TestLionClass(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getData(){
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void checkTheGenderOfALion() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals("Не удалось определить пол!", hasMane, lion.doesHaveMane());
    }

    @Test
    public void checkLionKittensCount() throws Exception {
        Lion lion = new Lion(sex, feline);
        int expected = 5;
        Mockito.when(feline.getKittens()).thenReturn(expected);
        assertEquals("Количество котят не совпадает!", expected, lion.getKittens());
    }

    @Test
    public void checkLionEatMeat() throws Exception {
        Lion lion = new Lion(sex, feline);
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expected);
        assertEquals("Львы не стали есть мясо!", expected, lion.getFood());
    }
}
