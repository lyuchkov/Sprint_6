import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Spy
    private Feline feline;

    @Test
    public void doesHaveManeMaleTest() throws Exception {
        Lion lion = new Lion("Самец", feline);

        assertTrue(lion.doesHaveMane());
    }
    @Test
    public void doesHaveManeFemaleTest() throws Exception {
        Lion lion = new Lion("Самка", feline);

        assertFalse(lion.doesHaveMane());
    }
    @Test
    public void getFoodFemaleDefaultFelineTest() throws Exception {
        Lion lion = new Lion("Самка", feline);

        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), lion.getFood());
    }
    @Test
    public void getFoodMaleDefaultFelineTest() throws Exception {
        Lion lion = new Lion("Самец", feline);

        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void lionWithInvalidSexTest() {
        try {
            Lion lion = new Lion("Невалидный пол", feline);
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }

    @Test
    public void getKittensMaleTest() {
        Lion lion;
        try {
            lion = new Lion("Самец", feline);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        assertEquals(1, lion.getKittens());
    }
    @Test
    public void getKittensFemaleTest() {
        Lion lion;
        try {
            lion = new Lion("Самка", feline);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        assertEquals(1, lion.getKittens());
    }
}
