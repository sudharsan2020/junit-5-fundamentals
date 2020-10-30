import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class) 
class HelloWorldTest {
    @Test
    void firstTest() {
        System.out.println("First test");
    }
}
