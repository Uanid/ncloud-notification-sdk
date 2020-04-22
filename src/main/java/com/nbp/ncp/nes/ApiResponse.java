/*
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.nbp.ncp.nes;

import java.util.List;
import java.util.Map;

/**
 * The type Api response.
 *
 * @param <T> the type parameter
 */
public class ApiResponse<T> {
	private final int httpStatusCode;
	private final Map<String, List<String>> httpHeaders;
    private final T body;

	/**
	 * Instantiates a new Api response.
	 *
	 * @param httpStatusCode the http status code
	 * @param httpHeaders the http headers
	 * @param body the body
	 */
	public ApiResponse(int httpStatusCode, Map<String, List<String>> httpHeaders, T body) {
		this.httpStatusCode = httpStatusCode;
		this.httpHeaders = httpHeaders;
		this.body = body;
	}

	/**
	 * Gets http status code.
	 *
	 * @return the http status code
	 */
	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	/**
	 * Gets http headers.
	 *
	 * @return the http headers
	 */
	public Map<String, List<String>> getHttpHeaders() {
		return httpHeaders;
	}

	/**
	 * Gets body.
	 *
	 * @return the body
	 */
	public T getBody() {
		return body;
	}
}
