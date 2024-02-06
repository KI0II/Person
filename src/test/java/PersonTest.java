import org.example.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void personTest() {
        for (int age = 12; age <= 19; age++) {
            boolean result = Person.isTeenager(age);
            System.out.println(age);
            System.out.println(result);
            assertTrue(result);
        }
    }
}
