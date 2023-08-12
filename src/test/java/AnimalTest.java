import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(Parameterized.class)
public class AnimalTest {
    private static final String FAMILY = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    private String animalType;
    private List<String> expectedFood;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[]{"Травоядное", Arrays.asList("Трава", "Различные растения")},
                new Object[]{"Хищник", Arrays.asList("Животные", "Птицы", "Рыба")},
                new Object[]{"Неизвестный вид животного", null}
        );
    }

    public AnimalTest(String animalType, List<String> expectedFood) {
        this.animalType = animalType;
        this.expectedFood = expectedFood;
    }

    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        assertEquals(FAMILY, animal.getFamily());
    }

    @Test
    public void getFoodTest() {
        Animal animal = new Animal();

        List<String> actualFood = null;
        try {
            actualFood = animal.getFood(animalType);
        } catch (Exception e) {
            assertNull(expectedFood);
        }

        assertEquals(expectedFood,actualFood);
    }
}
