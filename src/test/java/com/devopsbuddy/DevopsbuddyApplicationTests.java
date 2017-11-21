package com.devopsbuddy;

import com.devopsbuddy.web.i18n.I18NService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
@WebAppConfiguration
public class DevopsbuddyApplicationTests {

	@Autowired
	private I18NService i18NService;

	@Test
	public void contextLoads() {

		}

		public void testMessageByLocalService() throws Exception{

			String expectedResult = "Bootstrap Starter Template";
			String messageId = "index.main.callout";
			String actual = i18NService.getMessage(messageId);
			Assert.assertEquals("The actual and expected Strings don't match", expectedResult, actual);
		}
}
