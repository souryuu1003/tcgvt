package com.souryuu.tcgvt.vo;

public class CardVO {

	private int cardNo; // 카드번호
	private String cardName; // 카드이름
	private String cardImage; // 카드 이미지
	
	private String agency; // 소속
	private String tagList; // 태그(최대 3개)
	
	private int presence; // 장악력 (AP)
	private int mentality; // 정신력 (DP)
	private int retention; // 유지력 (HP)
	
	private String mainSkill; // 메인스킬
	private String supportSkill; // 서포트스킬
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
	public int getMentality() {
		return mentality;
	}
	public void setMentality(int mentality) {
		this.mentality = mentality;
	}
	public int getRetention() {
		return retention;
	}
	public void setRetention(int retention) {
		this.retention = retention;
	}
	public String getMainSkill() {
		return mainSkill;
	}
	public void setMainSkill(String mainSkill) {
		this.mainSkill = mainSkill;
	}
	public String getSupportSkill() {
		return supportSkill;
	}
	public void setSupportSkill(String supportSkill) {
		this.supportSkill = supportSkill;
	}
	@Override
	public String toString() {
		return "CardVO [cardNo=" + cardNo + ", cardName=" + cardName + ", cardImage=" + cardImage + ", agency=" + agency
				+ ", tagList=" + tagList + ", presence=" + presence + ", mentality=" + mentality + ", retention="
				+ retention + ", mainSkill=" + mainSkill + ", supportSkill=" + supportSkill + "]";
	}

}
