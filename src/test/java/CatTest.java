import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {
    @Mock
    Feline predator;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(predator);

        String sound = cat.getSound();

        assertEquals("Мяу", sound);
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(predator);
        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        List<String> actualFood = cat.getFood();

        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualFood);
    }
}
