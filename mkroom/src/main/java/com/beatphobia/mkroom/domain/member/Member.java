package com.beatphobia.mkroom.domain.member;

import java.sql.Timestamp;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Member {
	
	private String userId;
	private String userPw;
	private String userName;
	private String phoneNumber;
	private String email;
	private Timestamp regDate;
	private Timestamp modDate;
	private long discountCoupon;
	private long questPoint;
	private String branchLocation;
	private String enabled;
	
	private List<MemberAuthority> authorityList;

	
	
	public Member() {
		super();
	}

	public Member(String userId, String userPw, String userName, String phoneNumber, String email, Timestamp regDate,
			Timestamp modDate, long discountCoupon, long questPoint, String branchLocation, String enabled,
			List<MemberAuthority> authorityList) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.regDate = regDate;
		this.modDate = modDate;
		this.discountCoupon = discountCoupon;
		this.questPoint = questPoint;
		this.branchLocation = branchLocation;
		this.enabled = enabled;
		this.authorityList = authorityList;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public Timestamp getModDate() {
		return modDate;
	}

	public void setModDate(Timestamp modDate) {
		this.modDate = modDate;
	}

	public long getDiscountCoupon() {
		return discountCoupon;
	}

	public void setDiscountCoupon(long discountCoupon) {
		this.discountCoupon = discountCoupon;
	}

	public long getQuestPoint() {
		return questPoint;
	}

	public void setQuestPoint(long questPoint) {
		this.questPoint = questPoint;
	}

	public String getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public List<MemberAuthority> getAuthorityList() {
		return authorityList;
	}

	public void setAuthorityList(List<MemberAuthority> authorityList) {
		this.authorityList = authorityList;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", regDate=" + regDate + ", modDate=" + modDate
				+ ", discountCoupon=" + discountCoupon + ", questPoint=" + questPoint + ", branchLocation="
				+ branchLocation + ", enabled=" + enabled + ", authorityList=" + authorityList + "]";
	}
	
	
	
}
