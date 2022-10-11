package org.example;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @BeforeEach
    public void initBeforeEachTest(){
        System.out.println("Initializing Test Case.");
        calc = new Calculator();
    }

    @AfterEach
    public void tearDownAfterEachTest(){
        System.out.println("Test Case Completed.");
    }

    @Test
    @DisplayName("Sum of two positive numbers.")
    public void sumTest(){
        int actualResult = calc.sum(2,3);
        int expectedResult = 5;
//        Assertions.assertEquals(expectedResult,actualResult);
        org.assertj.core.api.
                Assertions.assertThat(actualResult)
                .isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("Difference of two positive numbers.")
    @Disabled
    public void subTest(){
        int ar = calc.sub(5,4);
        int er = 1;
//        Assertions.assertEquals(ar,er);
        org.assertj.core.api.
                Assertions.assertThat(ar)
                .isEqualTo(er);
    }

    @Test
    @DisplayName("Division of two positive numbers.")
    public void divTest(){
        double actR = calc.div(15,2);
        double expR = 7.5;
        Assertions.assertEquals(actR,expR);
        org.assertj.core.api.
                Assertions.assertThat(actR)
                .isEqualTo(expR);
    }

    @Test
    @DisplayName("Product of two positive numbers.")
    public void prodTest(){
        int AR = calc.prod(3,5);
        int ER = 15;
//        Assertions.assertEquals(AR,ER);
        org.assertj.core.api.
                Assertions.assertThat(AR)
                .isEqualTo(ER);
    }
}
