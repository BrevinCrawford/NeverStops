import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SuperStackTest {

	@BeforeEach
	public void setUp() throws Exception {
	}

	@Test
	public void testSuperStack() {
		fail("not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		// create and empty stack and check if it empty
		SuperStack<Integer> stack = new SuperStack<>(1);
		boolean result = stack.isEmpty();
		assertTrue(result);

		stack.push(new Integer(0));
		result = stack.isEmpty();
		assertFalse(result);
		// add a few elements and check if it is empty
	}

	@Test
	public void testIsFull() {
		fail("Not yet implemented");
	}

	@Test
	public void testPush() {
		fail("Not yet implemented");
	}

	@Test
	public void testPop() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
