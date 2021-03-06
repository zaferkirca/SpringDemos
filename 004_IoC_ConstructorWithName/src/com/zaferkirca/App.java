package com.zaferkirca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("beans.xml");
		Zafer market = (Zafer) ac.getBean("zafer");
		market.sloganAt();

		((FileSystemXmlApplicationContext) ac).close();
	}
}