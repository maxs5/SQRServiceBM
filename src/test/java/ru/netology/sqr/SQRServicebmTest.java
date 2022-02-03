package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServicebmTest {

    @ParameterizedTest
    @CsvSource(value = {"'test1',200,300,3",
            "'test2',100,200,5"})
    void shouldCalculate(String testName, int lowValue, int upValue, int expected) {
        SQRServicebm service = new SQRServicebm();


        // вызываем целевой метод:
        int actual = service.calculate(lowValue, upValue);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }
}