package com.rest.service.OnlineOrders;

public class OnlineOrdersException extends Exception{
	
	OnlineOrdersException(Long id){
		super("Could not found detais with "+id);
	}
}
