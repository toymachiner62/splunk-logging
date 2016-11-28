package edu.ccs.util.logging;

import static org.assertj.core.api.Assertions.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.splunk.logging.*;

import edu.ccs.util.logging.LogFactory;
import net.avh4.test.junit.Nested;

@RunWith(Nested.class)
public class LogFactoryTest {

	@Test
	public void shouldReturnLogger() {
		assertThat(LogFactory.getLogger(LogFactoryTest.class)).isInstanceOf(Logger.class);
	}
	
	@Test
	public void splunkLogger() {
		Logger logger = LogFactory.getLogger(LogFactoryTest.class);
		Date date = new Date();
		String jsonMsg = String.format("{event:'CancerCenterTest'}");
		logger.info("CancerCenterTest");
		logger.info(jsonMsg);
		logger.info(jsonMsg);
		logger.info(jsonMsg);
	}
}
