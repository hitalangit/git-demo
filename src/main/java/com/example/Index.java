package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Index {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		return "index";
	}

	@RequestMapping(value = "/top", method = RequestMethod.GET)
	public String top(ModelMap modelMap) {
		return "top";
	}

	@RequestMapping(value = "/left", method = RequestMethod.GET)
	public String left(ModelMap modelMap) {
		return "left";
	}

	@RequestMapping(value = "/bottom", method = RequestMethod.GET)
	public String bottom(ModelMap modelMap) {
		return "bottom";
	}

	@RequestMapping(value = "/sa", method = RequestMethod.GET)
	public String dashboard(ModelMap modelMap) {
		return "sa";
	}

}
