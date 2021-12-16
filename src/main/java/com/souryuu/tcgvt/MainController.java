package com.souryuu.tcgvt;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.souryuu.tcgvt.service.UserService;
import com.souryuu.tcgvt.vo.UserVO;

@Controller
public class MainController {
	
	@Resource(name = "userService")
	private UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) throws Exception {
		try {
		    List<UserVO> userList = userService.selectUserList();
		    model.addAttribute("userList", userList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "index";
	}
	
}