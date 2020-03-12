package com.capg.spring_mobile_demo;

import java.util.HashMap;
import java.util.Map;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.stereotype.Component;
@Configuration
@ComponentScan("com.capg.spring_mobile_demo")
@PropertySource("app.properties")
public class MobileConfigurations {
//	@Bean(name="vodafone")
//	public VodafoneSim getVodafoneSim() {
//		VodafoneSim vf=new VodafoneSim();
//		vf.setCallCharges(1.75f);
//		vf.setInternetSpeed(6.5f);
//		Map<String,Long> contacts=new HashMap<>();
//		contacts.put("Rebeca", 123456789L);
//		contacts.put("prameela", 987654321L);
//		contacts.put("abhi", 2345678901L);
//		vf.setContacts(contacts);
//		return vf;
//		
//	}
//	@Bean(name="mobile")
//	public Mobile getMobile() {
//		Mobile m=new Mobile();
//		//m.setSim(getVodafoneSim());
//		return m;
//	}

}
