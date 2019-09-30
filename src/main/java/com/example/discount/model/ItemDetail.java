package com.example.discount.model;

public class ItemDetail {
	
	private ItemType itemType;
	private int amount;
	
	/**
	 * @return the itemType
	 */
	public ItemType getItemType() {
		return itemType;
	}
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param itemType the itemType to set
	 */
	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}