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
 * AddressBookResponseGroups
 */
public class AddressBookResponseGroups {
	private Integer sid = null;

	private String groupName = null;

	private Integer addressCount = null;

	public AddressBookResponseGroups sid(Integer sid) {
		this.sid = sid;
		return this;
	}

	 /**
	 * 수신자 그룹 ID
	 * @return sid
	**/
	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public AddressBookResponseGroups groupName(String groupName) {
		this.groupName = groupName;
		return this;
	}

	 /**
	 * 수신자 그룹명
	 * @return groupName
	**/
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public AddressBookResponseGroups addressCount(Integer addressCount) {
		this.addressCount = addressCount;
		return this;
	}

	 /**
	 * 수신자 그룹에 포함된 이메일 주소 개수
	 * @return addressCount
	**/
	public Integer getAddressCount() {
		return addressCount;
	}

	public void setAddressCount(Integer addressCount) {
		this.addressCount = addressCount;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AddressBookResponseGroups addressBookResponseGroups = (AddressBookResponseGroups) o;
		return Objects.equals(this.sid, addressBookResponseGroups.sid) &&
				Objects.equals(this.groupName, addressBookResponseGroups.groupName) &&
				Objects.equals(this.addressCount, addressBookResponseGroups.addressCount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sid, groupName, addressCount);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddressBookResponseGroups {\n");
		
		sb.append("		sid: ").append(toIndentedString(sid)).append("\n");
		sb.append("		groupName: ").append(toIndentedString(groupName)).append("\n");
		sb.append("		addressCount: ").append(toIndentedString(addressCount)).append("\n");
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

