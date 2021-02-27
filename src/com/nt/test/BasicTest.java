package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WelcomeGreetings;

public class BasicTest {

	public static void main(String[] args) {
		//locate and hold spring bean cfg configration
     FileSystemResource res= new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
     //create ioc container(xmlbean factory)
     XmlBeanFactory factory=new XmlBeanFactory(res);
     //get spring bean class object from springcontainer/ioc container
     Date d=(Date)factory.getBean("dt");
     System.out.println("d obj date::"+d);
     System.out.println("----------");
     WelcomeGreetings greetings=(WelcomeGreetings)factory.getBean("wg");
     System.out.println("message::"+greetings.welcome("raja"));

	}

}
