package com.iotplatform.utils;

import java.util.List;

public class PageDataResult {

	//总记录数量
	private Integer totals;
	//当前页数据列表
	private List<?> list;

	private Integer code=200;


	private Integer total;

	//当前页数据列表
	private List<?> rows;



	public PageDataResult() {
	}

	public PageDataResult( Integer totals,
			List<?> list) {
		this.totals = totals;
		this.list = list;
	}

	public Integer getTotals() {
		return totals;
	}

	public void setTotals(Integer totals) {
		this.totals = totals;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

	@Override public String toString() {
		return "PageDataResult{" + "totals=" + totals + ", list=" + list
				+ ", code=" + code + '}';
	}
}
