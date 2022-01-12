package com.souryuu.tcgvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShopController {

	@RequestMapping(value = "/shop/card", method = RequestMethod.GET)
	public String shopCard(Model model) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "/shop/card";
	}
	
	@RequestMapping(value = "/shop/booster", method = RequestMethod.GET)
	public String shopBooster(Model model) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "/shop/booster";
	}
	
	@RequestMapping(value = "/shop/deck", method = RequestMethod.GET)
	public String shopDeck(Model model) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "/shop/deck";
	}
	
}
