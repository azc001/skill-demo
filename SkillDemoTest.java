import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
	//Checks whether 2 times 2 equals 4
	@Test
	public void multiplyTest() {
		assertEquals(4, SkillDemo.multiply(2, 2));
	}
}