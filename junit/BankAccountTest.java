package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BankAccountTest {
    @Test void testBankOperations() {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
        
        account.withdraw(30.0);
        assertEquals(120.0, account.getBalance());
        
        assertThrows(IllegalStateException.class, () -> account.withdraw(500.0));
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10));
    }
}