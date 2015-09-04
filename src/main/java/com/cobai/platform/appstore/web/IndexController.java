package com.cobai.platform.appstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@RequestMapping("/{app}/**")
	@ResponseBody
	public String getIndex(@PathVariable("app") String app) {
		return "hello " + app;
	}
	
}
