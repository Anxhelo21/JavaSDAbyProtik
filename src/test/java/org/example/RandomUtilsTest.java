package org.example;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RandomUtilsTest {

    @Test
    public void testRandomNumber(){
        Scanner sc = new Scanner(System.in);
        //given
        int high = sc.nextInt();
        int low = sc.nextInt();
        //when
        int actualGeneratedNumber = RandomUtils.getRandomNumber(high,low);

        //then
//        Assertions.assertTrue(actualGeneratedNumber> -11 && actualGeneratedNumber < 11);

        org.assertj.core.api.
                Assertions.assertThat(actualGeneratedNumber)
                .isBetween(45,50);
    }
}
