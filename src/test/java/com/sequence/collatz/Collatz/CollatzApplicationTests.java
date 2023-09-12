package com.sequence.collatz.Collatz;

import com.sequence.collatz.Collatz.Service.CollatzService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CollatzApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private CollatzService collatzService;

    @Test
    public void testCalculateCollatzSequenceLength() {
        // Test some sample inputs and expected outputs
        assertEquals(1, collatzService.calculateCollatzSequenceLength(1));
        assertEquals(112, collatzService.calculateCollatzSequenceLength(27));
        assertEquals(179, collatzService.calculateCollatzSequenceLength(871));
    }

}
