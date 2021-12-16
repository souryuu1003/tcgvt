package com.souryuu.tcgvt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.souryuu.tcgvt.dao.UserDAO;
import com.souryuu.tcgvt.service.UserService;
import com.souryuu.tcgvt.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserDAO userMapper;
	
	@Override
	public List<UserVO> selectUserList() throws Exception {
		return userMapper.selectUserList();
	}
}
