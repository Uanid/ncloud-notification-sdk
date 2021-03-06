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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UnsubscribeListResponse
 */
public class UnsubscribeListResponse {
	private Integer totalElements = null;

	private Integer totalPages = null;

	private Integer numberOfElements = null;

	private Boolean first = null;

	private Boolean last = null;

	private Integer number = null;

	private Integer size = null;

	private List<EmailSendListResponseSort> sort = null;

	private List<UnsubscribeListResponseContent> content = null;

	public UnsubscribeListResponse totalElements(Integer totalElements) {
		this.totalElements = totalElements;
		return this;
	}

	 /**
	 * 총 레코드 개수
	 * @return totalElements
	**/
	public Integer getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	public UnsubscribeListResponse totalPages(Integer totalPages) {
		this.totalPages = totalPages;
		return this;
	}

	 /**
	 * 총 페이지 개수
	 * @return totalPages
	**/
	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public UnsubscribeListResponse numberOfElements(Integer numberOfElements) {
		this.numberOfElements = numberOfElements;
		return this;
	}

	 /**
	 * 현재 페이지의 레코드 개수
	 * @return numberOfElements
	**/
	public Integer getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(Integer numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	public UnsubscribeListResponse first(Boolean first) {
		this.first = first;
		return this;
	}

	 /**
	 * 첫번째 페이지 여부
	 * @return first
	**/
	public Boolean isFirst() {
		return first;
	}

	public void setFirst(Boolean first) {
		this.first = first;
	}

	public UnsubscribeListResponse last(Boolean last) {
		this.last = last;
		return this;
	}

	 /**
	 * 마지막 페이지 여부
	 * @return last
	**/
	public Boolean isLast() {
		return last;
	}

	public void setLast(Boolean last) {
		this.last = last;
	}

	public UnsubscribeListResponse number(Integer number) {
		this.number = number;
		return this;
	}

	 /**
	 * 현재 페이지 index (0부터 시작)
	 * @return number
	**/
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public UnsubscribeListResponse size(Integer size) {
		this.size = size;
		return this;
	}

	 /**
	 * 한페이지에 당 레코드 개수
	 * @return size
	**/
	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public UnsubscribeListResponse sort(List<EmailSendListResponseSort> sort) {
		this.sort = sort;
		return this;
	}

	public UnsubscribeListResponse addSortItem(EmailSendListResponseSort sortItem) {
		if (this.sort == null) {
			this.sort = new ArrayList<EmailSendListResponseSort>();
		}
		this.sort.add(sortItem);
		return this;
	}

	 /**
	 * Get sort
	 * @return sort
	**/
	public List<EmailSendListResponseSort> getSort() {
		return sort;
	}

	public void setSort(List<EmailSendListResponseSort> sort) {
		this.sort = sort;
	}

	public UnsubscribeListResponse content(List<UnsubscribeListResponseContent> content) {
		this.content = content;
		return this;
	}

	public UnsubscribeListResponse addContentItem(UnsubscribeListResponseContent contentItem) {
		if (this.content == null) {
			this.content = new ArrayList<UnsubscribeListResponseContent>();
		}
		this.content.add(contentItem);
		return this;
	}

	 /**
	 * Get content
	 * @return content
	**/
	public List<UnsubscribeListResponseContent> getContent() {
		return content;
	}

	public void setContent(List<UnsubscribeListResponseContent> content) {
		this.content = content;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UnsubscribeListResponse unsubscribeListResponse = (UnsubscribeListResponse) o;
		return Objects.equals(this.totalElements, unsubscribeListResponse.totalElements) &&
				Objects.equals(this.totalPages, unsubscribeListResponse.totalPages) &&
				Objects.equals(this.numberOfElements, unsubscribeListResponse.numberOfElements) &&
				Objects.equals(this.first, unsubscribeListResponse.first) &&
				Objects.equals(this.last, unsubscribeListResponse.last) &&
				Objects.equals(this.number, unsubscribeListResponse.number) &&
				Objects.equals(this.size, unsubscribeListResponse.size) &&
				Objects.equals(this.sort, unsubscribeListResponse.sort) &&
				Objects.equals(this.content, unsubscribeListResponse.content);
	}

	@Override
	public int hashCode() {
		return Objects.hash(totalElements, totalPages, numberOfElements, first, last, number, size, sort, content);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UnsubscribeListResponse {\n");
		
		sb.append("		totalElements: ").append(toIndentedString(totalElements)).append("\n");
		sb.append("		totalPages: ").append(toIndentedString(totalPages)).append("\n");
		sb.append("		numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
		sb.append("		first: ").append(toIndentedString(first)).append("\n");
		sb.append("		last: ").append(toIndentedString(last)).append("\n");
		sb.append("		number: ").append(toIndentedString(number)).append("\n");
		sb.append("		size: ").append(toIndentedString(size)).append("\n");
		sb.append("		sort: ").append(toIndentedString(sort)).append("\n");
		sb.append("		content: ").append(toIndentedString(content)).append("\n");
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

