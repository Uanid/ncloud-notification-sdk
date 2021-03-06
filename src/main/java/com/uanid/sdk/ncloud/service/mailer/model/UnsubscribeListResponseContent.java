/*
 * api
 * Cloud Outbound Mailer API<br/>https://mail.test-apigw.ntruss.com/api/v1
 *
 * OpenAPI spec version: 2019-06-20T02:51:35Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.uanid.sdk.ncloud.service.mailer.model;

import java.util.Objects;

/**
 * UnsubscribeListResponseContent
 */
public class UnsubscribeListResponseContent {
	private String address = null;

	private UnsubscribeListResponseBlockDate blockDate = null;

	private Boolean isRegByManager = null;

	public UnsubscribeListResponseContent address(String address) {
		this.address = address;
		return this;
	}

	 /**
	 * Email 주소
	 * @return address
	**/
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public UnsubscribeListResponseContent blockDate(UnsubscribeListResponseBlockDate blockDate) {
		this.blockDate = blockDate;
		return this;
	}

	 /**
	 * Get blockDate
	 * @return blockDate
	**/
	public UnsubscribeListResponseBlockDate getBlockDate() {
		return blockDate;
	}

	public void setBlockDate(UnsubscribeListResponseBlockDate blockDate) {
		this.blockDate = blockDate;
	}

	public UnsubscribeListResponseContent isRegByManager(Boolean isRegByManager) {
		this.isRegByManager = isRegByManager;
		return this;
	}

	 /**
	 * 관리자 등록 여부 (true: 관리자가 등록, false: 메일 수신자가 링크를 통해 수신거부 등록)
	 * @return isRegByManager
	**/
	public Boolean isIsRegByManager() {
		return isRegByManager;
	}

	public void setIsRegByManager(Boolean isRegByManager) {
		this.isRegByManager = isRegByManager;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UnsubscribeListResponseContent unsubscribeListResponseContent = (UnsubscribeListResponseContent) o;
		return Objects.equals(this.address, unsubscribeListResponseContent.address) &&
				Objects.equals(this.blockDate, unsubscribeListResponseContent.blockDate) &&
				Objects.equals(this.isRegByManager, unsubscribeListResponseContent.isRegByManager);
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, blockDate, isRegByManager);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UnsubscribeListResponseContent {\n");
		
		sb.append("		address: ").append(toIndentedString(address)).append("\n");
		sb.append("		blockDate: ").append(toIndentedString(blockDate)).append("\n");
		sb.append("		isRegByManager: ").append(toIndentedString(isRegByManager)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n		");
	}

}

