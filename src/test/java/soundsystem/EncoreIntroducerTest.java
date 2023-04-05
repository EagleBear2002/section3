package soundsystem;

import concert.ConcertConfig;
import concert.Encoreable;
import concert.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class EncoreIntroducerTest {
	@Autowired
	private Performance musicPerformance;
	
	@Test
	public void testEncore() {
		Encoreable encoreable = (Encoreable) musicPerformance; //使用方法
		encoreable.performEncore();
	}
}