package model.entities;

import java.util.Date;

public class Contract {

	private Integer number;
	private Date date;
	private Double totalValue;

	private Installment installment;
	
	public Contract() {}
	
	public Contract(Integer number, Date date, Double totalValue) {
		this.date = date;
		this.number = number;
		this.totalValue = totalValue;
	}

}
