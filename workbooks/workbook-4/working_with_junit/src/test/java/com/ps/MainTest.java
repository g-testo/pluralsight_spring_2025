package com.ps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void addTwoNumbers_should_returnSum() {
        // AAA
        // Arrange
        int firstNum = 1;
        int secondNum = 1;

        int expected = 2;

        // Act
        int actual = Main.add(firstNum, secondNum);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void addTwoNegativeNumbers_should_returnSum(){
        int firstNum = -1;
        int secondNum = -1;

        int expected = -2;

        // Act
        int actual = Main.add(firstNum, secondNum);

        // Assert
        assertEquals(expected, actual);
    }
}