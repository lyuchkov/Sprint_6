import com.example.Alex;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlexTest {
    private static final List<String> FRIENDS = List.of("Марти", "Глория", "Мелман");
    private static final String PLACE_OF_LIVING = "Нью-Йоркский зоопарк";
    @Test
    public void getFriendsTest(){
        try {
            Alex alex = new Alex();

            assertEquals(FRIENDS, alex.getFriends());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void getPlaceOfLivingTest(){
        try {
            Alex alex = new Alex();

            assertEquals(PLACE_OF_LIVING, alex.getPlaceOfLiving());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void getKittensTest(){
        try {
            Alex alex = new Alex();

            assertEquals(0, alex.getKittens());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void doesHaveManeByDefaultConstructorTest(){
        try {
            Alex alex = new Alex();

            assertTrue(alex.doesHaveMane());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
