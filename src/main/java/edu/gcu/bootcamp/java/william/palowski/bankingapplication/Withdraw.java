package edu.gcu.bootcamp.java.william.palowski.bankingapplication;

import java.math.BigDecimal;

public interface Withdraw {
	void doWithdraw(BigDecimal amount, Account account);

}