package com.sivadas.anand.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sivadas.anand.domain.Message;

@Service
public class GreetingService {
	
	private final KieContainer kieContainer;

	@Autowired
	public GreetingService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public Message applyGreetingRules(Message message) {
		//get the stateful session
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(message);
		kieSession.fireAllRules();
		kieSession.dispose();
		return message;
	}

}
