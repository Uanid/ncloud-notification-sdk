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
import com.nbp.ncp.nes.model.EmailRequestStatusResponseStatus;

/**
 * EmailRequestStatusResponseCountsByStatus
 */
public class EmailRequestStatusResponseCountsByStatus {
	private EmailRequestStatusResponseStatus status = null;

	private Integer count = null;

	public EmailRequestStatusResponseCountsByStatus status(EmailRequestStatusResponseStatus status) {
		this.status = status;
		return this;
	}

	 /**
	 * Get status
	 * @return status
	**/
	public EmailRequestStatusResponseStatus getStatus() {
		return status;
	}

	public void setStatus(EmailRequestStatusResponseStatus status) {
		this.status = status;
	}

	public EmailRequestStatusResponseCountsByStatus count(Integer count) {
		this.count = count;
		return this;
	}

	 /**
	 * 메일 건수
	 * @return count
	**/
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EmailRequestStatusResponseCountsByStatus emailRequestStatusResponseCountsByStatus = (EmailRequestStatusResponseCountsByStatus) o;
		return Objects.equals(this.status, emailRequestStatusResponseCountsByStatus.status) &&
				Objects.equals(this.count, emailRequestStatusResponseCountsByStatus.count);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, count);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EmailRequestStatusResponseCountsByStatus {\n");
		
		sb.append("		status: ").append(toIndentedString(status)).append("\n");
		sb.append("		count: ").append(toIndentedString(count)).append("\n");
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

