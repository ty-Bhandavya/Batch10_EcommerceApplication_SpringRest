package com.te.ecommercespringrest.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("response")
@JsonPropertyOrder({ "status", "msg" })
@XmlRootElement(name = "response")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemResponse {

	@JsonProperty("status")
	@XmlElement(name = "status-code")
	private int statusCode;

	private String msg;

	@JsonProperty("employee_info")
	@XmlElement(name = "employee-info")
	private ItemBean bean;

	private List<ItemBean> employeeInfos;
}
