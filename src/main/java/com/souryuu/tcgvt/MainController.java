package com.souryuu.tcgvt;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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
	
	HttpSession session;
	
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
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(Model model) throws Exception {
		try {
		    model.addAttribute("userId", "souryuu1003@gmail.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "main";
	}
	
}