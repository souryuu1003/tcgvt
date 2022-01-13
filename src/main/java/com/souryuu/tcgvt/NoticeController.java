package com.souryuu.tcgvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NoticeController {

	@RequestMapping(value = "/notice/update", method = RequestMethod.GET)
	public String tradeHouse(Model model) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "/notice/update";
	}
	
	@RequestMapping(value = "/notice/event", method = RequestMethod.GET)
	public String tradeAuction(Model model) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "/notice/event";
	}
	
}
