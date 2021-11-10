package com.ibm.currency;

public class CurrencyConverter {

	double convert(double amount,Currency source,Currency target) {
		double rate = target.dollarValue()/source.dollarValue();
	return rate*amount;
	}

}
