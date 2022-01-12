package com.souryuu.tcgvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TradeController {

	@RequestMapping(value = "/trade/house", method = RequestMethod.GET)
	public String tradeHouse(Model model) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "/trade/house";
	}
	
	@RequestMapping(value = "/trade/auction", method = RequestMethod.GET)
	public String tradeAuction(Model model) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "/trade/auction";
	}
	
}
