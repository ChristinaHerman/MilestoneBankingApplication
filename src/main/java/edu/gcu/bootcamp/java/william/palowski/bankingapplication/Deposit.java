package edu.gcu.bootcamp.java.william.palowski.bankingapplication;

import java.math.BigDecimal;

public interface Deposit {
	void doDeposit(BigDecimal amount, Account account);

}
