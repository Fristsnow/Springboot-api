package com.fdemo.fdemo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult {
	private int code;
	private String msg;
	private Object data;

	public static ResponseResult newInstance() {
		return new ResponseResult();
	}

	public ResponseResult code(int code) {
		this.code = code;
		return this;
	}

	public ResponseResult msg(String msg) {
		this.msg = msg;
		return this;
	}

	public ResponseResult data(Object data) {
		this.data = data;
		return this;
	}
}