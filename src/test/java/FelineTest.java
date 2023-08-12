import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        String family = feline.getFamily();
        Assert.assertEquals(family, "Кошачьи");
    }

    @Test
    public void eatMeatTest(){
        Feline feline = new Feline();
        List<String> food;
        try {
           food = feline.eatMeat();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(food, List.of("Животные", "Птицы", "Рыба"));
    }
}
