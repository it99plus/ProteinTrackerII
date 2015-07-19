package com.sipleprogram.proteintracker;

public class HistoryItem {

	private final int id;
	private final int amount;
	private final String operation;
	private final int total;
	
	public HistoryItem(int id, int amount, String operation, int total) {
		this.id = id;
		this.amount = amount;
		this.operation = operation;
		this.total = total;
		
		
	}

	public int getId() {
		return id;
	}
	
	public String getOperation() {
		return operation;	
	}
	

	public int getAmount() {
		return amount;
	}


	public int getTotal() {
		return total;
	}

}
