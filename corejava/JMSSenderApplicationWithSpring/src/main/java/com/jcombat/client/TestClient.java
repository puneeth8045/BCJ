package com.jcombat.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.jcombat.sender.SimpleMessageSender;

public class TestClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext jmsContext = null;
		jmsContext = new FileSystemXmlApplicationContext(
				"C:/Users/user/Dropbox/jCombat/Shared on jCombat/JMSSenderApplicationWithSpring/src/main/webapp/WEB-INF/jmsContext.xml");
		SimpleMessageSender messageSender = (SimpleMessageSender) jmsContext
				.getBean("simpleMessageSender");

		// Create a session within the connection.
		messageSender.sendMessage("hello");
	}
}