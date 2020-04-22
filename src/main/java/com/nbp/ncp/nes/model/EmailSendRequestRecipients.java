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


package com.nbp.ncp.nes.model;

import java.util.Objects;

/**
 * EmailSendRequestRecipients
 */
public class EmailSendRequestRecipients {
	private String address = null;

	private String name = null;

	private String type = "R";

	private Object parameters = null;

	public EmailSendRequestRecipients address(String address) {
		this.address = address;
		return this;
	}

	 /**
	 * 수신자 Email 주소
	 * @return address
	**/
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public EmailSendRequestRecipients name(String name) {
		this.name = name;
		return this;
	}

	 /**
	 * 수신자 명
	 * @return name
	**/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmailSendRequestRecipients type(String type) {
		this.type = type;
		return this;
	}

	 /**
	 * 수신자 유형 (R: 수신자, C: 참조인, B: 숨은참조)
	 * @return type
	**/
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public EmailSendRequestRecipients parameters(Object parameters) {
		this.parameters = parameters;
		return this;
	}

	 /**
	 * 치환 파라미터 (수신자별로 적용), &#39;치환 ID&#39; 를 key로, &#39;치환 ID에 맵핑되는 값&#39; 을 value로 가지는 Map 형태의 Object
	 * @return parameters
	**/
	public Object getParameters() {
		return parameters;
	}

	public void setParameters(Object parameters) {
		this.parameters = parameters;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EmailSendRequestRecipients emailSendRequestRecipients = (EmailSendRequestRecipients) o;
		return Objects.equals(this.address, emailSendRequestRecipients.address) &&
				Objects.equals(this.name, emailSendRequestRecipients.name) &&
				Objects.equals(this.type, emailSendRequestRecipients.type) &&
				Objects.equals(this.parameters, emailSendRequestRecipients.parameters);
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, name, type, parameters);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EmailSendRequestRecipients {\n");
		
		sb.append("		address: ").append(toIndentedString(address)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		type: ").append(toIndentedString(type)).append("\n");
		sb.append("		parameters: ").append(toIndentedString(parameters)).append("\n");
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

