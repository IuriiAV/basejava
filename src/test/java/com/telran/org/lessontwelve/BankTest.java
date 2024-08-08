package com.telran.org.lessontwelve;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank bank = new Bank();

    @Test
    //@Disabled
    public void checkValidAccountNumberWhenAccountCorrect() {
        String account = "12345678901234";
        boolean result = bank.isValidAccountNumber(account);
        assertTrue(result);

        //assertNull();
        //assertNotEquals();
        //assertArrayEquals();
    }

    @Test
    public void checkNotValidAccountNumberWhenAccountIsNull() {
      assertFalse(bank.isValidAccountNumber(null));
    }

    @Test
    public void checkNotValidAccountNumberWhenLengthIncorrect() {
         assertFalse(bank.isValidAccountNumber("123456789012"));
    }

    @Test
    public void checkNotValidAccountNumberWhenAccountHasNonDigitSymbol() {
        assertFalse(bank.isValidAccountNumber("12345A78901234"));
    }

    @Test
    public void checkNotValidAccountNumberWhenAccountHasAllZeroSymbol() {
        assertFalse(bank.isValidAccountNumber("00000000000000"));
    }

    @Test
    public void checkNotValidAccountNumberWhenAccountHasAllSpaceSymbol() {
        assertFalse(bank.isValidAccountNumber("              "));
    }
}