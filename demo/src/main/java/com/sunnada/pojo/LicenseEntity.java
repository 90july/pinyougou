package com.sunnada.pojo;

import lombok.*;

@Data
public class LicenseEntity {
	/**
	 * 证照名称
	 */
	private String name;
	/**
	 * 目录唯一ID
	 */
	private String code;
	/**
	 * 编号格式
	 */
	private String serialNumberFormat;
	/**
	 * 小类编码
	 */
	private String classCode;
	/**
	 * 版本号
	 */
	private String versions;


	private Integer id;
}
