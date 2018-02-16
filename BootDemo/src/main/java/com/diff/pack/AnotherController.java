package com.diff.pack;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class AnotherController {	

	private static Logger logger = Logger.getLogger(AnotherController.class);
	
	
	@RequestMapping("/rest/hello")
	@ResponseBody
	public String sayHello()
	{
		logger.debug("sayHello method called");
		return "Latest New Boot Demo Page From Docker";
	}
}

