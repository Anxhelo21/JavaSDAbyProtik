package org.example;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

public class RandTest {

    @Test
    void isTrue() {
        assertThat("\t".length() > 0).isTrue();
    }
    
    @Test
    public void testNull() {
        String text = null;
       // org.junit.jupiter.api.Assertions.assertNull(text);
        org.junit.jupiter.api.Assertions.assertNull(text, "Testing using assertNull");
    }
}
