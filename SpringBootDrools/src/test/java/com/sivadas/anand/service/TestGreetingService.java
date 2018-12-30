package com.sivadas.anand.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sivadas.anand.GreetingAppConfiguration;
import com.sivadas.anand.domain.Message;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = GreetingAppConfiguration.class)
public class TestGreetingService {

	@Autowired
	private GreetingService service;
	
	@Test
	public void testApplyGreetingRules_HappyPath() {
		
		Message message = new Message();
		message.setMessage("Dummy Msg");
		Message finalMessage = service.applyGreetingRules(message);
		Assert.assertEquals("Message status mismatch", 1, finalMessage.getStatus());
		
	}
}
