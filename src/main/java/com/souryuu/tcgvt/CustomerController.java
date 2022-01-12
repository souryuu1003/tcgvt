package com.souryuu.tcgvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
	
	@RequestMapping(value = "/customer/FAQ", method = RequestMethod.GET)
	public String customerFAQ(Model model) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "/customer/FAQ";
	}
	
	@RequestMapping(value = "/customer/QNA", method = RequestMethod.GET)
	public String customerQNA(Model model) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "/customer/QNA";
	}
	
}
