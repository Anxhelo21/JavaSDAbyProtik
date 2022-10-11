package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateTest {

    @Test
    public void testRemoveDuplicate(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        ArrayList<Integer> temp = RemoveDuplicate.removeDuplicate(list);
        org.assertj.core.api.Assertions.assertThat(temp)
                .doesNotHaveDuplicates();
    }
}
