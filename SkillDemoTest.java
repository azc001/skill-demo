import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
	//Checks whether 2 times 2 equals 5
	@Test
	public void multiplyTest() {
		assertEquals(5, SkillDemo.multiply(2, 2));
	}
}