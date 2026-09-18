package model.service;

public interface OnlyPaymentService {

	
	Double paymentFee(Double amount);
	
	Double interest(Double amount, Integer months);
	
}
