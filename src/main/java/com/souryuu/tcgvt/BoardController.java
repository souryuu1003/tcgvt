package com.souryuu.tcgvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

	@RequestMapping(value = "/board/free", method = RequestMethod.GET)
	public String boardFree(Model model) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "/board/free";
	}
	
	@RequestMapping(value = "/board/tip", method = RequestMethod.GET)
	public String boardTip(Model model) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "/board/tip";
	}
	
	@RequestMapping(value = "/board/forum", method = RequestMethod.GET)
	public String boardForum(Model model) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "/board/forum";
	}
	
}
