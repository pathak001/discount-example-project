package com.example.discount.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import com.example.discount.model.ItemType;
import com.example.discount.model.Order;
import com.example.discount.util.Constants;

@Service
public class DiscountExampleService {

	public int calculateDiscount(Order order) {

		int totalAmount = order.getItemDetails().stream().mapToInt(a -> a.getAmount()).reduce(0, Integer::sum);
		int amountWithoutGrocery = order.getItemDetails().stream()
				.filter(i -> !(i.getItemType().equals(ItemType.GROCERY))).mapToInt(a -> a.getAmount())
				.reduce(0, Integer::sum);
		
		int percentDiscount = 0;
		switch(order.getCustomerDetails().getCustomerType()) {
			case  EMPLOYEE :
				if(amountWithoutGrocery!=0) {
					percentDiscount = (amountWithoutGrocery * Constants.EMP_DISCOUNT)/100;
				}
				break;
			case  AFFILIATE :
				if(amountWithoutGrocery!=0) {
					percentDiscount = (amountWithoutGrocery * Constants.AFL_DISCOUNT)/100;
				}
				break;
			case  CUSTOMER :
				if(amountWithoutGrocery!=0) {
					long diffInMillies = Math.abs(order.getCurrentDate().getTime() - order.getCustomerDetails().getCreationDate().getTime());
				    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
				    
					percentDiscount = diff >= 365*2 ? (amountWithoutGrocery * Constants.CUST_TWO_YRS)/100 : 0;
				}
				break;
			default:
				percentDiscount = 0;
		}
		
		int extraDiscount = totalAmount >= 100 ? (totalAmount/100)*5 : 0;
		return (totalAmount - (percentDiscount + extraDiscount));
	}

}
