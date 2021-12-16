package com.souryuu.tcgvt.vo;

import java.sql.Date;
import java.util.List;

public class UserVO {
	
	private int userNo; // 회원번호
	private String userId; // 메일주소
	private String userPw; // 비밀번호
	private Date userDate; // 가입일
	private int userRl; // 유저권한
	private int userMc; // 매크로카운터
	
	private String gameGrade; // 게임등급
	private int gameExp; // 게임경험치
	private int gameMoney; // 게임화폐
	
	private int winCount; // 승리횟수
	private int loseCount; // 패배횟수
	
	private List<DeckVO> haveDeckList; // 보유 덱 목록
	private List<CardVO> haveCardList; // 보유 카드 목록
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public Date getUserDate() {
		return userDate;
	}
	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}
	public int getUserRl() {
		return userRl;
	}
	public void setUserRl(int userRl) {
		this.userRl = userRl;
	}
	public String getGameGrade() {
		return gameGrade;
	}
	public void setGameGrade(String gameGrade) {
		this.gameGrade = gameGrade;
	}
	public int getGameExp() {
		return gameExp;
	}
	public void setGameExp(int gameExp) {
		this.gameExp = gameExp;
	}
	public int getGameMoney() {
		return gameMoney;
	}
	public void setGameMoney(int gameMoney) {
		this.gameMoney = gameMoney;
	}
	public int getWinCount() {
		return winCount;
	}
	public void setWinCount(int winCount) {
		this.winCount = winCount;
	}
	public int getLoseCount() {
		return loseCount;
	}
	public void setLoseCount(int loseCount) {
		this.loseCount = loseCount;
	}
	public List<DeckVO> getHaveDeckList() {
		return haveDeckList;
	}
	public void setHaveDeckList(List<DeckVO> haveDeckList) {
		this.haveDeckList = haveDeckList;
	}
	public List<CardVO> getHaveCardList() {
		return haveCardList;
	}
	public void setHaveCardList(List<CardVO> haveCardList) {
		this.haveCardList = haveCardList;
	}
	public int getUserMc() {
		return userMc;
	}
	public void setUserMc(int userMc) {
		this.userMc = userMc;
	}
	
	@Override
	public String toString() {
		return "UserVO [userNo=" + userNo + ", userId=" + userId + ", userPw=" + userPw + ", userDate=" + userDate
				+ ", userRl=" + userRl + ", userMc=" + userMc + ", gameGrade=" + gameGrade + ", gameExp=" + gameExp
				+ ", gameMoney=" + gameMoney + ", winCount=" + winCount + ", loseCount=" + loseCount + ", haveDeckList="
				+ haveDeckList + ", haveCardList=" + haveCardList + "]";
	}
	
}
