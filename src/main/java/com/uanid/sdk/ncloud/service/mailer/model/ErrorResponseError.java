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
 * ErrorResponseError
 */
public class ErrorResponseError {
	private String code = null;

	private String errorCode = null;

	private String message = null;

	public ErrorResponseError code(String code) {
		this.code = code;
		return this;
	}

	 /**
	 * 에러 코드, ( 77001:METHOD_NOT_ALLOWED, 77002:UNSUPPORTED_MEDIA_TYPE, 77101:로그인 정보 오류, 77102:BAD_REQUEST, 77103:리소스가 존재하지 않습니다., 77201:권한없음, 77202:Email 상품 사용신청 하지 않음, 77301:기본 프로젝트가 존재하지 않음, 77302:외부 시스템 API 연동 오류, 77303:그외 INTERNAL_SERVER_ERROR )
	 * @return code
	**/
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ErrorResponseError errorCode(String errorCode) {
		this.errorCode = errorCode;
		return this;
	}

	 /**
	 * API Gateway Error Code
	 * @return errorCode
	**/
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public ErrorResponseError message(String message) {
		this.message = message;
		return this;
	}

	 /**
	 * 상세 에러 메세지
	 * @return message
	**/
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ErrorResponseError errorResponseError = (ErrorResponseError) o;
		return Objects.equals(this.code, errorResponseError.code) &&
				Objects.equals(this.errorCode, errorResponseError.errorCode) &&
				Objects.equals(this.message, errorResponseError.message);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, errorCode, message);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ErrorResponseError {\n");
		
		sb.append("		code: ").append(toIndentedString(code)).append("\n");
		sb.append("		errorCode: ").append(toIndentedString(errorCode)).append("\n");
		sb.append("		message: ").append(toIndentedString(message)).append("\n");
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
