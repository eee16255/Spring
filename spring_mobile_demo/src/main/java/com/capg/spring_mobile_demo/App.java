package com.capg.spring_mobile_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Mobile m;
        ApplicationContext c=new ClassPathXmlApplicationContext("spring.xml");
        
        m=(Mobile)c.getBean("mobile");
        m.makeACall();
        m.browseInternet();
    }
}
