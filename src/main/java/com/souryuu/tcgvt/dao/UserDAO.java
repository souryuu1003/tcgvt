package com.souryuu.tcgvt.dao;

import java.util.List;

import com.souryuu.tcgvt.vo.UserVO;

public interface UserDAO {
	List<UserVO> selectUserList() throws Exception;
}