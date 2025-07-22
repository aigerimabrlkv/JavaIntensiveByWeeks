package calculator;

import  org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    @Test
    void addZero() {
        double CalculatedAnswer = Calculator.add(2,0);
        assertEquals(2, CalculatedAnswer);
    }

    @Test
    void addNegatives(){
        double CalculatedAnswer = Calculator.add(-7, -9.7);
        assertEquals(-16.7, CalculatedAnswer);

    }
    @Test
    void add(){
        assertAll(
                () ->         assertEquals(-16.7, Calculator.add(-7, -9.7)),
                () ->  assertEquals(2, Calculator.add(2, 0)),
                () -> assertEquals(15, Calculator.add(3,8,4))

        );


    }


@Test
void multiply() {
    assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
            () -> assertEquals(-4, Calculator.multiply(2, -2)),
            () -> assertEquals(4, Calculator.multiply(-2, -2)),
            () -> assertEquals(0, Calculator.multiply(1, 0)));
}
}