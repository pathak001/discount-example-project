package com.example.discount.model;

import java.util.Date;
import java.util.List;

public class Order {
	
	private long orderId;
	private Date currentDate;
	
	private Customer customerDetails;
	private List<ItemDetail> itemDetails;
	
	/**
	 * @return the orderId
	 */
	public long getOrderId() {
		return orderId;
	}
	/**
	 * @return the currentDate
	 */
	public Date getCurrentDate() {
		return currentDate;
	}
	/**
	 * @return the customerDetails
	 */
	public Customer getCustomerDetails() {
		return customerDetails;
	}
	/**
	 * @return the itemDetails
	 */
	public List<ItemDetail> getItemDetails() {
		return itemDetails;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	/**
	 * @param currentDate the currentDate to set
	 */
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	/**
	 * @param customerDetails the customerDetails to set
	 */
	public void setCustomerDetails(Customer customerDetails) {
		this.customerDetails = customerDetails;
	}
	/**
	 * @param itemDetails the itemDetails to set
	 */
	public void setItemDetails(List<ItemDetail> itemDetails) {
		this.itemDetails = itemDetails;
	}
}
