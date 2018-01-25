package com.mofancn.common.pojo;

import java.util.List;

import com.mofancn.pojo.TbOrder;
import com.mofancn.pojo.TbOrderItem;
import com.mofancn.pojo.TbOrderShipping;

public class order extends TbOrder {
	private List<TbOrderItem> listOrderItems;
	private TbOrderShipping tbOrderShipping;
	public List<TbOrderItem> getListOrderItems() {
		return listOrderItems;
	}
	public void setListOrderItems(List<TbOrderItem> listOrderItems) {
		this.listOrderItems = listOrderItems;
	}
	public TbOrderShipping getTbOrderShipping() {
		return tbOrderShipping;
	}
	public void setTbOrderShipping(TbOrderShipping tbOrderShipping) {
		this.tbOrderShipping = tbOrderShipping;
	}
	
}
