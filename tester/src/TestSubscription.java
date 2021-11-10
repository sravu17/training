import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestSubscription {
	private Subscription subs;
	@BeforeEach
	public void setup() {
		subs = new Subscription();
	}
	@Test
	public void testMonthly() {
		assertEquals(100, subs.monthly());
	}
	@Test
	public void testQuarterly() {
		assertEquals(250, subs.quarterly());
	}
	@Test
	public void testAnnually() {
		assertEquals(1000, subs.annually());
	}
	

}
