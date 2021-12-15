package com.souryuu.tcgvt.vo;

public class CardVO {

	private int cardNo; // 카드번호
	private String cardName; // 카드이름
	private String cardImage; // 카드 이미지
	
	private String agency; // 소속
	private String tagList; // 태그(메인/서브/서브)
	private int presence; // 장악력
	private int retention; // 유지력
	
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardImage() {
		return cardImage;
	}
	public void setCardImage(String cardImage) {
		this.cardImage = cardImage;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getTagList() {
		return tagList;
	}
	public void setTagList(String tagList) {
		this.tagList = tagList;
	}
	public int getPresence() {
		return presence;
	}
	public void setPresence(int presence) {
		this.presence = presence;
	}
	public int getRetention() {
		return retention;
	}
	public void setRetention(int retention) {
		this.retention = retention;
	}
	
	@Override
	public String toString() {
		return "CardVO [cardNo=" + cardNo + ", cardName=" + cardName + ", cardImage=" + cardImage + ", agency=" + agency
				+ ", tagList=" + tagList + ", presence=" + presence + ", retention=" + retention + "]";
	}
	
}
