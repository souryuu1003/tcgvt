package com.souryuu.tcgvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CardsController {

	@RequestMapping(value = "/cards/deck", method = RequestMethod.GET)
	public String cardsDeck(Model model) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "/cards/deck";
	}
	
	@RequestMapping(value = "/cards/list", method = RequestMethod.GET)
	public String cardsList(Model model) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "/cards/list";
	}
	
	@RequestMapping(value = "/cards/album", method = RequestMethod.GET)
	public String cardsAlbum(Model model) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "/cards/album";
	}
	
}
