/**
 * 
 */
package com.infosys.swagger2.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Girish_Ramagiri
 *
 */
@ApiModel(description = "Details about the Member")
public class Member {
	@ApiModelProperty(notes = "The unique ID of the Member")
	public int memberId;
	@ApiModelProperty(notes = "The Member's name")
	public String memberName;
	@ApiModelProperty(notes = "The Member's phone number")
	public String memberPhone;

	/**
	 * @return the memberId
	 */
	public int getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * @return the memberPhone
	 */
	public String getMemberPhone() {
		return memberPhone;
	}

	/**
	 * @param memberPhone the memberPhone to set
	 */
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberPhone=" + memberPhone + "]";
	}

}
