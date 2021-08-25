package se.ecutb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendingMachineClassTest {
    VendingMachineClass testMachine;

    @BeforeEach
    void setUp() {
        testMachine = new VendingMachineClass();
    }

    @Test
    void addCurrency() {
        testMachine.addCurrency(500);
        assertEquals(500, testMachine.getBalance());
        testMachine.addCurrency(45);
    }

    @Test
    void getBalance() {
        addCurrency();
        assertEquals(500, testMachine.getBalance());
    }

    @Test
    void request() {
        testMachine.request(1);
        testMachine.addCurrency(500);
        testMachine.request(1);
    }

    @Test
    void endSession() {
        testMachine.addCurrency(100);
        testMachine.request(1);
        assertEquals(40, testMachine.endSession());
    }

    @Test
    void getDescription() {
        testMachine.getDescription(0);
    }

    @Test
    void getProducts() {
        testMachine.getProducts();
    }
}