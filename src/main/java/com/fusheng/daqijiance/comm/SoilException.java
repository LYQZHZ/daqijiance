package com.fusheng.daqijiance.comm;

/**
 * 类
 * 
 * @author lgq
 *
 */
public class SoilException extends Exception {

	/** 异常编码 */
	private com.fusheng.daqijiance.comm.ExceptionCode code = com.fusheng.daqijiance.comm.ExceptionCode.UNKNOWN_ERROR;

	/**
	 * 构造函数
	 */
	public SoilException() {
		super();
	}

	/**
	 * 构造函数
	 * 
	 * @param code 异常编码
	 */
	public SoilException(ExceptionCode code) {
		super();
		this.code = code;
	}

	/**
	 * 构造函数
	 * 
	 * @param message 异常消息
	 */
	public SoilException(String message) {
		super(message);
	}

	/**
	 * 构造函数
	 * 
	 * @param code 异常编码
	 * @param message 异常消息
	 */
	public SoilException(ExceptionCode code, String message) {
		super(message);
		this.code = code;
	}

	/**
	 * 构造函数
	 * 
	 * @param cause 异常原因
	 */
	public SoilException(Throwable cause) {
		super(cause);
	}

	/**
	 * 构造函数
	 * 
	 * @param code 异常编码
	 * @param cause 异常原因
	 */
	public SoilException(ExceptionCode code, Throwable cause) {
		super(cause);
		this.code = code;
	}

	/**
	 * 构造函数
	 * 
	 * @param message 异常消息
	 * @param cause 异常原因
	 */
	public SoilException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * 构造函数
	 * 
	 * @param code 异常编码
	 * @param message 异常消息
	 * @param cause 异常原因
	 */
	public SoilException(ExceptionCode code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
	}

	/**
	 * 获取异常编码
	 * 
	 * @return 异常编码
	 */
	public ExceptionCode getCode() {
		return code;
	}

}
