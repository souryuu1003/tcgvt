package com.souryuu.tcgvt.service;

import java.util.List;

import com.souryuu.tcgvt.vo.UserVO;

public interface UserService {
	List<UserVO> selectUserList() throws Exception;
}
