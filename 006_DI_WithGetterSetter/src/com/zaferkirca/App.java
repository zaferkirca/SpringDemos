package com.zaferkirca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.zaferkirca.arac.IAraba;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("beans.xml");
		IAraba araba = (IAraba) ac.getBean("araba", IAraba.class);
		
		araba.Ilerle();
		
		((FileSystemXmlApplicationContext) ac).close();
	}
}